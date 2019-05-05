package global.config.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.AntPathMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import global.mybatis.dto.User;

public class PermissionInterceptor implements HandlerInterceptor {
	
	private final Logger log = LoggerFactory.getLogger(PermissionInterceptor.class);
	
	private AntPathMatcher match = new AntPathMatcher();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
    	User user = null;
    	try {
	    	Subject subject = SecurityUtils.getSubject();
	    	user = (User) subject.getPrincipal();
	    	System.out.println(user.getSn());
    	} catch (Exception e) {
    		log.info("当前用户没有登录");
    	} finally {
//    		if (null != user) {
//    			if (null == user.getRole()) {
//    				response.sendError(HttpStatus.BAD_GATEWAY.value(),"没有权限访问");
//    				return false;
//    			}
//    			if (!user.getRole().isStatus()) {
//    				response.sendError(HttpStatus.BAD_GATEWAY.value(),"角色被禁用");
//    				return false;
//    			}
//    			List<Permission> pList = user.getRole().getMenupermissions();
//    			String requestUri = request.getRequestURI();
//    			if (requestUri.indexOf(";") > 0) {
//    				requestUri = requestUri.substring(0, requestUri.indexOf(";"));
//    			}
//    			for (Permission permission : pList) {
//					if (match.match(permission.getMenu().getUri(), requestUri)) {
//						return true;
//					}
//				}
//    			response.sendError(HttpStatus.BAD_GATEWAY.value(),"没有权限访问");
//    			return false;
//    		}
    	}
        return true;
        // 只有返回true才会继续向下执行，返回false取消当前请求
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // >>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    	User user = null;
    	try {
	    	Subject subject = SecurityUtils.getSubject();
	    	user = (User) subject.getPrincipal();
	    	System.out.println(user.getSn());
    	} catch (Exception e) {
    		log.info("当前用户没有登录");
    	} finally {
    		if (null != user) {
    			// modelAndView不为空处理
    			if (modelAndView != null) {
    				modelAndView.addObject("currentuser", user);
    			}
    		}
    	}
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }
}