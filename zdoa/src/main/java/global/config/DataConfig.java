package global.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@MapperScan("global.mybatis.mapper")
@PropertySource("classpath:/jdbc/jdbc.properties")
public class DataConfig implements TransactionManagementConfigurer {
	
	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(env.getProperty(ConfigConstants.JDBCURL + ConfigConstants.JDBCMYSQL));
		dataSource.setDriverClassName(env.getProperty(ConfigConstants.JDBCDRIV + ConfigConstants.JDBCMYSQL));
		dataSource.setUsername(env.getProperty(ConfigConstants.JDBCUSER + ConfigConstants.JDBCMYSQL));
		dataSource.setPassword(env.getProperty(ConfigConstants.JDBCPASS + ConfigConstants.JDBCMYSQL));
		return dataSource;
	}

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFcatory = new SqlSessionFactoryBean();
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFcatory.setDataSource(dataSource());
		sessionFcatory.setTypeAliasesPackage("global.mybatis.dto");
		sessionFcatory.setMapperLocations(resolver.getResources("classpath*:mybatis/*.xml"));
		sessionFcatory.getObject().getConfiguration().setLogImpl(Log4jImpl.class);
		return sessionFcatory;
	}
	
    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());

        return transactionManager;
    }

    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return transactionManager();
    }
}
