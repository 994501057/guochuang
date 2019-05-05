package global.config.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import global.mybatis.dto.User;
import global.web.service.UserService;

/**
 * Security - 授权域
 * @version 1.0
 */
public class AuthorizingRealm extends org.apache.shiro.realm.AuthorizingRealm {

	@Autowired
	private UserService userService;

	 /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户名称
        String sn = (String) token.getPrincipal();
        User user = userService.findBySn(sn);
        if (user == null) {
            // 用户名不存在抛出异常
            System.out.println("认证：当前登录的用户不存在");
            throw new UnknownAccountException();
        }
        String pwd = user.getPassword();
        return new SimpleAuthenticationInfo(user, pwd, getName());
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection princ) {
        return null;
    }

}