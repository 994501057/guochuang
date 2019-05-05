package global.web.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import global.mybatis.dto.User;
import global.web.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user")
	public String toUsers(){
		
		return "users";
	}
	
	
	/*
	 * 查询所有人员的列表信息
	 * 返回值类型是
	 * 获取前台的两个参数page，rows
	 */
	@PostMapping(value="/management/index")
	@ResponseBody
	public List<User>  queryUserList(Integer currentPage,Integer pageSize){
		 
			return userService.findUser(currentPage,pageSize);
		
	
	
	}
	/*
	 * 新建人员
	 * 返回值  响应状态码
	 * 需要参数  前台的form表单
	 * 需不需要进行后台的校验？
	 * 
	 */
	@RequestMapping(value="/management/save")
	@ResponseBody
	public ResponseEntity<Void>  addUser(User user){
		try {
	         System.out.println("---------"+user.getInductionDate());
	         System.out.println("---------"+user.getModified_date());
	         System.out.println("---------"+user.getSex());
			// 新增用户
			this.userService.saveUser(user);
			// 新增成功，返回201
			return new ResponseEntity<Void>(HttpStatus.CREATED);
				
		} catch (Exception e) {
			e.printStackTrace();
			// 出现异常，返回500
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	
	
	/*
	 * 人员修改
	 * 返回值      响应状态码
	 * 需要参数  前台的人员id
	 * 人员修改应该有数据回显  具体怎么操作？
	 */
	@PostMapping(value="/management/update")
	@ResponseBody
	public  ResponseEntity<Void>  userUpdate( User user){
		try {
			// 人员修改
	         this.userService.updateUser(user);
			// 修改成功，返回201
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			// 出现异常，返回500
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
			
			
		
		
	}
	
	/*
	 * 人员详情
	 * 参数 id 通过id查看详情
	 */
	@GetMapping("/management/detail/{id}")
	@ResponseBody
	public User userDetail(@PathVariable("id") Long id){
	
	return  this.userService.userDetail(id);
		
	}
   
	
	
	
	
	
	
	}
