package global.web.service;

import java.util.Date;
import java.util.List;

import global.mybatis.dto.Leave;
import global.mybatis.dto.LeaveAll;

/**  
* @ClassName: LeaveService  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/30 13:59:09    
* 
*    
*/
public interface LeaveService {
	
	/**  
	* @Title: updateLeaveById  
	* @Description: 通过id修改  
	* @param id
	* @param remark
	* @param startdate
	* @param enddate
	* @param day    
	*/
	void updateLeaveById(Leave leave);
	
	/**  
	* @Title: addLeave  
	* @Description: 添加请假表
	* @param id
	* @param remark
	* @param startdate
	* @param enddate
	* @param day    
	*/
	void addLeave(Leave leave);
	
	/**  
	* @Title: findLeaveBytimeAndNameAndType  
	* @Description: 通过时间和名字和类型来查询
	* @param starttime
	* @param endtime
	* @param created_by
	* @return    
	*/
	List<LeaveAll> findLeaves(Leave leave);
	
	/**  
	* @Title: findLeaveAndexamineforWeb  
	* @Description: 将所有休假表单及相关详情查询出来      
	*/
	List<LeaveAll> findLeaveAndexamineforWeb();
	
	/**  
	* @Title: deleteLeaveAndexamineforWeb  
	* @Description: 删除相关内容 
	* @param id    
	*/
	void deleteLeaveAndexamineforWeb(Leave leave);
	
}
