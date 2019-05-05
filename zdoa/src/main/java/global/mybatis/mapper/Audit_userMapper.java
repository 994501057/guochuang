package global.mybatis.mapper;

import java.util.Date;
import java.util.List;

import global.mybatis.dto.Audit_user;

/**  
* @ClassName: Aduit_userMapper  
* @Description: 管理流程建构的实体类
* @date 2018/11/05 14:24:32    
* 
*    
*/
public interface Audit_userMapper {
	/**  
	* @Title: findAduit_userByDivision_idAndType  
	* @Description: 通过部门和请假类型和审核人id来获得流程  
	* @param division_id
	* @param type
	* @return   List<Aduit_user> 
	*/
	List<Audit_user> findAudit_userByDivision_idAndTypeAndUser_id(long division_id , String type , long user_id);
	
	/**  
	* @Title: findAduit_userByuser_id  
	* @Description: 通过id和获得对象 
	* @param user_id
	* @return  Aduit_user  
	*/
	Audit_user findAudit_userById(long id);
	
	/**  
	* @Title: addAduit_user  
	* @Description: 添加审核流程      
	*/
	void addAudit_user();
	
	/**  
	* @Title: updateAduit_user  
	* @Description: 修改审核序列 
	* @param id
	* @param division_id
	* @param user_id
	* @param level
	* @param type
	* @param modified_by
	* @param modified_date    
	*/
	void updateAudit_user(long id,long division_id,long user_id,int level,String type,String modified_by,Date modified_date);
	
	/**  
	* @Title: deleteAduit_user  
	* @Description: 根据条件删除对应的数据  
	* @param id 表单的自增id
	* @param division_id 部门id
	* @param user_id 人员id
	* @param type    请假单类型
	*/
	void deleteAudit_user(long id , long division_id,long user_id,String type);
	
}
