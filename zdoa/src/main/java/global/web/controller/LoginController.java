package global.web.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import global.config.SpringShiroConfig;
import global.mybatis.dto.User;

@Controller
public class LoginController {
    // Log
    private final Logger log = LoggerFactory.getLogger(LoginController.class);

    @GetMapping(value = {"/login", "/"})
    public String index(ModelMap map) {
        log.info("用户进入登录页面");
        if (SecurityUtils.getSubject().isAuthenticated()) {
            return "redirect:/index";
        } else {
            return "/login/login";
        }

    }
    @PostMapping("/login")
    public String login(User user, ModelMap map) {
    	//String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        // 表面校验
        if (!StringUtils.isNotEmpty(user.getSn()) || !StringUtils.isNotEmpty(user.getPassword())) {
            map.put("message", "账号或密码不能为空");
            return "/login/login";
        }
        // 获取主体
        Subject subject = SecurityUtils.getSubject();
        try {
            // 调用安全认证框架的登录方法
          String password = SpringShiroConfig.hashedPassword(user.getPassword());
        	//String password2 = SpringShiroConfig.hashedPassword(password);
        	subject.login(new UsernamePasswordToken(user.getSn(), password));
        } catch (AuthenticationException ex) {
            log.info("登陆失败: " + ex.getMessage());
            map.put("message", "账号密码不正确，请重新输入");
            return "/login/login";
        }
        // 登录成功后重定向到首页
        return "redirect:/index";
    }
}
