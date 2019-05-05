package global.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.mybatis.dto.Division;
import global.mybatis.dto.User;
import global.web.service.DivisionService;

/**  
* @ClassName: DivisionController  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/25 17:15:21    
* Company www.igeekhome.com
*    
*/
@Controller
@RequestMapping("/division")
public class DivisionController {
	
	@Autowired
	private DivisionService divisionService;
	
	/**  
	* @Title: exhibition  
	* @Description: 上传所有部门  
	* @param map
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/finddivisions")
	public String exhibition(ModelMap map){
		List<Division> findDivisions = divisionService.findDivisions(null);
		map.addAttribute("findDivisions",findDivisions);
		//输入网址
		return "/division/demoDivision";
	}
	
	
	/**  
	* @Title: adddivision  
	* @Description:  添加词条
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException
	*/
	@RequestMapping(method = RequestMethod.POST,value="/adddivision")
	public String adddivision(Division division,ModelMap map){
			
		//获取当前时间
		Date day = new Date();
		//创建时间和修改时间
		division.setCreated_date(day);
		division.setModified_date(day);
		//获取用户信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		//创建人和修改人
		division.setCreated_by(user.getUsername());
		division.setModified_by(user.getUsername());
		
		try {
			divisionService.addDivision(division);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("message", "部门添加失败");
			//回显数据
			exhibition(map);
			//输入网址
			return "/division/demoDivision";
		}
		//回显数据
		exhibition(map);
		//输入网址
		return "/division/demoDivision";
	}
	
	/**  
	* @Title: updatedivision  
	* @Description: 修改词条
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/updatedivision/{id}")
	public String updatedivision(Division division,ModelMap map){
		//获取用户信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		division.setModified_by(user.getUsername());
		//获取当前时间
		Date day = new Date();
		division.setModified_date(day);
		try {
			divisionService.updateDivisionfromId(division);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("message", "部门修改失败");
			//回显数据
			exhibition(map);
			//输入网址
			return "/division/demoDivision";
		}
		//回显数据
		exhibition(map);
		//输入网址
		return "/division/demoDivision";
	}
	
	/**  
	* @Title: deletedivision  
	* @Description: 删除部门
	* @param division
	* @param map
	* @return    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/deletedivision/{id}")
	public String deletedivision(Division division,ModelMap map){
		try {
			divisionService.deleteDivisionfromId(division);
		} catch (Exception e) {
			e.getMessage();
			map.put("message", "部门删除失败");
			//回显数据
			exhibition(map);
			//输入网址
			return "/division/demoDivision";
		}
		//回显数据
		exhibition(map);
		//输入网址
		return "/division/demoDivision";
	}
	
	/**  
	* @Title: exhibition  
	* @Description: 上传所有部门  
	* @param map
	* @param request
	* @param response
	* @throws ServletException
	* @throws IOException    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/finddivision/{id}")
	public String findDivision(ModelMap map,Division division){
		try {
			List<Division> findDivisions = divisionService.findDivisions(division);
			map.addAttribute("findDivisions",findDivisions);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("message", "部门添加失败");
			//回显数据
			exhibition(map);
			//输入网址
			return "/division/demoDivision";
		}
		//回显数据
		exhibition(map);
		return "/division/demoAddDivision";
	}
	
	/**  
	* @Title: findAddUrl  
	* @Description: 跳转jsp界面
	* @return    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/findadd")
	public String findAddUrl(){
		return "/division/demoAddDivision";
	}
	
	/**  
	* @Title: findAddUrl  
	* @Description: 跳转jsp界面
	* @return    
	*/
	@RequestMapping(method = RequestMethod.GET,value="/findUpdate/{id}")
	public String findUpdateUrl(ModelMap map,Division division){
		try {
			List<Division> findDivisions = divisionService.findDivisions(division);
			map.put("findDivisions", findDivisions);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.put("message", "部门查询失败");
			//回显数据
			exhibition(map);
			//输入网址
			return "/division/demoDivision";
		}
		
		
		return "/division/demoUpdateDivision";
	}
}
