package global.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.help.PageBean;
import global.mybatis.dto.Division;
import global.mybatis.dto.Project_table;
import global.mybatis.dto.Project_user;
import global.mybatis.dto.User;
import global.web.service.DivisionService;
import global.web.service.ProjectService;
import global.web.service.ProjectUserService;
import global.web.service.UserService;

@Controller
@RequestMapping("/project/management")
public class ProjectController {
	private final Logger log = LoggerFactory.getLogger(ProjectController.class);
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectUserService projectUserService;
	@Autowired
	private DivisionService divisionService;
	@Autowired
	private UserService userService;
	/**
	 * 
	 * 首页展示
	 * @param map
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/index/{page}")
	public String selectProject(@PathVariable("page") Integer currentPage,ModelMap map){
		try{
		if(currentPage==null||currentPage==0){
			currentPage=1;
		}
		PageBean<Project_table> findProject_table = projectService.findProject_table(currentPage);
		map.addAttribute("findProject_table", findProject_table);
		return "/html/project";
		}catch(Exception e){
		return "/html/project";
		}		
	}
	/**
	 * 
	 * 首页展示1
	 * @param map
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/indexs")
	public String selectProjects(ModelMap map,Project_table project_table){
		try{List<Project_table> findProject_table = projectService.findProject_table(project_table);
		map.addAttribute("findProject_table", findProject_table);
		return "/html/project";
		}catch(Exception e){
		return "/html/project";
		}	
	}
	/**
	 * 
	 * 新增项目
	 * @param map
	 * @param request
	 * @param response
	 */
	@RequestMapping(value="/add")
	public String add(ModelMap map){
		try{
		List<Division> findDivisions = divisionService.findDivisions(null);
		map.addAttribute("findDivisions", findDivisions);
		return "/html/addProject";}
		catch(Exception e){
		e.getMessage();
		return "/html/addProject";			
		}
	}	
	/**
	 * 删除
	 * @param map	  
	 */
	@RequestMapping(method = RequestMethod.GET,value="/del/{id}")
	public String deleteProject(@PathVariable Long id ,ModelMap map){
		try{
		projectService.deleteProject(id);//调用delete方法	
		return "forward:/project/management/indexs" ;
	}catch(Exception e){
		e.printStackTrace();
		return "forward:/project/management/indexs" ;}
	}
	/**
	 * 
	 * 编辑
	 * @param map	
	 */
	@RequestMapping(value="/edit/{id}")	
	public String findProjects(@PathVariable("id") Long id,ModelMap map){	
		try{//获取当前时间
		Date date=new Date();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		//获取详情
		Project_table findProject_tableById = projectService.findProject_tableById(id);
		findProject_tableById.setCreatedDate(date);
		//获取当前用户		
		findProject_tableById.setCreatedBy(user.getUsername());
		findProject_tableById.setModifiedDate(date);
		findProject_tableById.setModifiedBy(user.getUsername());		
		map.addAttribute("findProject_tableById", findProject_tableById); 
		return "/html/editProject" ;
		}catch(Exception e){
		e.printStackTrace();
		return "/html/editProject" ;
		}	
	}
	/**
	 * 
	 * 详情
	 * @param map	
	 */
	@RequestMapping(value="/detail/{id}")	
	public String findProject(@PathVariable("id") Long id,ModelMap map){	
		try{//获取当前时间
		Date date=new Date();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		//获取详情
		Project_table findProject_tableById = projectService.findProject_tableById(id);
		findProject_tableById.setCreatedDate(date);
		//获取当前用户		
		findProject_tableById.setCreatedBy(user.getUsername());
		findProject_tableById.setModifiedDate(date);
		findProject_tableById.setModifiedBy(user.getUsername());		
		map.addAttribute("findProject_tableById", findProject_tableById); 
		return "/html/detailProject" ;
		}catch(Exception e){
		e.printStackTrace();
		return "/html/detailProject" ;
		}	
	}
	/** 
	 * 项目更新
	 * @param map
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping(value="/update")	
	public String updateProject(Project_table project_table, BindingResult  bindingResult){
		try{
		//获取当前时间
		Date date=new Date();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		project_table.setStartdate(date);
		project_table.setCreatedDate(date);
		project_table.setEnddate(date);
		project_table.setModifiedDate(date);
		project_table.setCreatedBy(user.getUsername());
		project_table.setModifiedBy(user.getUsername());
		projectService.update(project_table);//更新表	
		return "redirect:/project/management/index"	;
		}catch(Exception e){
		e.printStackTrace();
		return "redirect:/project/management/index"	;
		}
	}
	/** 
	 * 保存项目
	 * @param project_table 	
	 */
	@RequestMapping(value="/save")
	@ResponseBody
	public void addProjects(Project_table project_table,HttpServletRequest request){
		try{
		
		//获取负责人id
		Long user_id = Long.valueOf(request.getParameter("user"));
		//获取开发人员的id
		String parameter = request.getParameter("users");
		System.out.println(parameter);
		//获取当前时间
		Date date=new Date();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		//设置负责人id
		project_table.setUser_id(user_id);		
		project_table.setCreatedBy(user.getUsername());;
		project_table.setCreatedDate(date);
		project_table.setModifiedBy(user.getUsername());
		project_table.setModifiedDate(date);		
		//新增项目
		projectService.addProject(project_table);
		}catch(Exception e){
			e.getMessage();
		}		
	};	
	/** 
	 * 增加项目人员
	 * @param project_user  
	 *
	 */
	@RequestMapping(value="/addprojectUser")	
	public String addProjectUser(Project_user project_user){
		try{
		//新增项目人员
		projectUserService.addProjectUser(project_user);
		return "project_detail" ;		
		}catch(Exception e){			
		return "project_detail" ;		
		}		
	};
	/** 
	 *删除项目人员
	 * @param project_user
	 *
	 */
	@RequestMapping(value="/deleteprojectUser/{id}")	
	public String deleteProjectUser(@PathVariable Long id){	
		//新增项目人员
		projectUserService.deleteProjectUser(id);
		return "projectDetail" ;		
	};	
	/** 
	 *查询部门人员
	 * @param project_user 
	 *
	 */
	@RequestMapping("/selectUser")
	@ResponseBody 
	public List<User> selectUser(Long id){	
		//查询所有部门成员		
		try{
		List<User> UserList=userService.findUserList(id);
		//返回json数据findDivisions
		return UserList;
		}catch(Exception e){
		//返回json数据findDivisions
		System.out.println(e.getMessage());
		return null;
		}		
	}	
}
