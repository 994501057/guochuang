package global.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import global.config.security.PermissionInterceptor;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan("global.web")
@PropertySource("classpath:/file/file.properties")
public class SpringWebConfig implements WebMvcConfigurer {
	@Override
	public void addFormatters(FormatterRegistry registry) {
		 registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
		//WebMvcConfigurer.super.addFormatters(registry);
	}

	@Autowired
	Environment env;

	@Bean
    public InternalResourceViewResolver jspviewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(jspviewResolver());
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}


	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	@Bean
	public CookieLocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		localeResolver.setDefaultLocale(Locale.ENGLISH);
		localeResolver.setCookieName("my-locale-cookie");
		localeResolver.setCookieMaxAge(ConfigConstants.COOKIEMAXAGE);
		return localeResolver;
	}

	@Bean
	public LocaleChangeInterceptor localeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}
	
    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + env.getProperty("upLoadPath")+ File.separator);
    }
    
    @Bean
    public PermissionInterceptor permissionInterceptor() {
      return new PermissionInterceptor();
    }
    
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptor = registry.addInterceptor(permissionInterceptor());
		List<String> exPathList = new ArrayList<>();
		exPathList.add("/static/**"); // 可匿名访问的资源
		exPathList.add("/login"); // 登录页面
		exPathList.add("/login/**"); // 登录页面
		exPathList.add("/logout"); // 登出访问
		exPathList.add("/error"); // 错误页面
		exPathList.add("/upload/**"); // 文件
		addInterceptor.excludePathPatterns(exPathList);
		addInterceptor.addPathPatterns("/**");
	}
}
