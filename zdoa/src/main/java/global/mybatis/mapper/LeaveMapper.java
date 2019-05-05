package global.mybatis.mapper;

import java.util.List;

import global.mybatis.dto.Leave;

/**  
* @ClassName: LeaveMapper  
* @Description: 请假单Mapper
* @date 2018/10/29 13:17:08    
* 
*    
*/
public interface LeaveMapper {
	/**  
	* @Title: findAllLeave  
	* @Description: 获得所有请假单  
	* @return： List<Leave>    
	*/
	List<Leave> findAllLeave(Leave leave);
	
	/**  
	* @Title: deleteLeavebyId  
	* @Description: 通过id删除  
	* @param id    
	*/
	void deleteLeaveById(long id);
	
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
	List<Leave> findLeaveBytimeAndNameAndType(Leave leave);
	
	/**  
	* @Title: findLeaveIdAll  
	* @Description: 获取所有请假表id
	* @return    
	*/
	List<Long> findLeaveIdAll();
}
