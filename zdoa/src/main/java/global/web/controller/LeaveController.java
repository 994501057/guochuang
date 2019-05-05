package global.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import global.help.DateUtils;
import global.mybatis.dto.Leave;
import global.mybatis.dto.LeaveAll;
import global.web.service.LeaveService;

/**  
* @ClassName: LeaveController  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/11/07 13:27:32    
* 
*    
*/
@Controller
@RequestMapping("/leave")
public class LeaveController {
	private final Logger log = LoggerFactory.getLogger(LeaveController.class);
	
	@Autowired
	private LeaveService leaveService;
	
	/**  
	* @Title: findAllLeave  
	* @Description: 查看所有请假单
	* @param map
	* @param request
	* @param response    
	*/
	@GetMapping("/selectAllLeave")
	public void findAllLeave(ModelMap map,HttpServletRequest request,HttpServletResponse response , @RequestParam(required=false,defaultValue="1") Integer pageNum,
            @RequestParam(required=false,defaultValue="10") Integer pageSize){

		//设定开始页数和分页条数
		PageHelper.startPage(pageNum, pageSize);
		
		//获得对象
		List<LeaveAll> findLeaveAndexamineforWeb = leaveService.findLeaveAndexamineforWeb();
		
		//分页开始
		PageInfo pageInfo = new PageInfo(findLeaveAndexamineforWeb);
		//获取总页数
		int pageCount = pageInfo.getPages();
		
		//传给页码开始的页数，总页数和请假信息
		map.put("leaves", findLeaveAndexamineforWeb);
		map.put("status",1);
	    map.put("totalPage",pageCount);
	    
		//输入网址
		try {
			request.getRequestDispatcher("").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**  
	* @Title: addLeave  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param request
	* @param response    
	*/
	@PostMapping("/addLeave")
	public void addLeave(Leave leave){
		
		
	}
	
	@GetMapping("/updateLeave")
	public void updateLeave(HttpServletRequest request , HttpServletResponse response){
		//获取各类信息
		//获取请假表ID
		long id = Long.valueOf(request.getParameter("id"));
		//获取请假类型ID
		long dictionary_id = Long.valueOf(request.getParameter("dictionary_id"));
		//获取请假理由
		String remark = request.getParameter("remark");
		//获取开始时间
		Date startdate = DateUtils.parse(request.getParameter("startdate"));
		//获取结束时间
		Date enddate = DateUtils.parse(request.getParameter("enddate"));
		//获得请假天数
		int day = Integer.valueOf(request.getParameter("day"));
		
		//传入service层
		
		//输入网址
		try {
			request.getRequestDispatcher("").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@GetMapping("/deleteLeave")
	public void deleteLeave(HttpServletRequest request , HttpServletResponse response){
		//获取请假表ID
		Long id = Long.valueOf(request.getParameter("id"));
		
		//传入service层
		
		//输入网址
		try {
			request.getRequestDispatcher("").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@PostMapping("selectLeave")
	private void findLeaveBytimeAndNameAndType(ModelMap map,HttpServletRequest request,HttpServletResponse response , @RequestParam(required=false,defaultValue="1") Integer pageNum,
            @RequestParam(required=false,defaultValue="10") Integer pageSize){

		//设定开始页数和分页条数
		PageHelper.startPage(pageNum, pageSize);
		
		//获取各类信息
		//获取开始时间
		Date startTime = DateUtils.parse(request.getParameter("startTime"));
		//获取结束时间
		Date endTime = DateUtils.parse(request.getParameter("endTime"));
		//获取名字
		String created_by = request.getParameter("name");
		//获取请假类型ID
		long dictionary_id = Long.valueOf(request.getParameter("dictionary_id"));
		
		//传入service层
		
		//分页开始
		PageInfo pageInfo = new PageInfo();
		//获取总页数
		int pageCount = pageInfo.getPages();		
		//传给页码开始的页数，总页数和请假信息
		map.put("status",1);
	    map.put("totalPage",pageCount);		
		
		//输入网址
		try {
			request.getRequestDispatcher("").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
