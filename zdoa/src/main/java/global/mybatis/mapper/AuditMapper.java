package global.mybatis.mapper;

import java.util.Date;
import java.util.List;

import global.mybatis.dto.Audit;

/**  
* @ClassName: AuditMapper  
* @Description: TODO审批表的Mapper接口
* @date 2018/10/26 15:05:46    
* 
*    
*/
public interface AuditMapper {
	/**  
	* @Title: findAuditfromId  
	* @Description: 通过表单号获取审核结果
	* @param id
	* @return    
	*/
	List<Audit> findAuditfromAudit_Id(long audit_id);
	
	/**  
	* @Title: findAuditfromId  
	* @Description: 通过id获取审核结果
	* @param id
	* @return    
	*/
	Audit findAuditfromId(long id);
	
	/**  
	* @Title: addAudit  
	* @Description: 添加审核结果  
	* @param audit    
	*/
	void addAudit(long audit_id, long user_id, String result, String remark, Date time, String created_by,
			Date created_date, String modified_by, Date modified_date);
	
	/**  
	* @Title: updateAudit  
	* @Description: 改变审核结果 
	* @param audit    
	*/
	void updateAudit(long audit_id, long user_id, String result, String remark, Date time, String modified_by, Date modified_date);
	
	/**  
	* @Title: deleteAuditsByAudit_id  
	* @Description: 通过单号删除对应的审批结果  
	* @param audit_id    
	*/
	void deleteAuditsByAudit_id(long audit_id);
}
