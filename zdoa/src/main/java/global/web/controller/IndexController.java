package global.web.controller;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import global.mybatis.dto.User;

@Controller
public class IndexController {
	// Log
	private final Logger log = LoggerFactory.getLogger(IndexController.class);

	@GetMapping("/index")
	public String index(ModelMap map) {
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		log.info("用户:(" + user.getUsername() + ") 进入首页");
		map.addAttribute("info", user);
		return "/login/index";
	}
}
