package configServer.gc.cc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	@GetMapping("/zjl")
  public String hello(){
	return "sdnk";
	  
  }
}
