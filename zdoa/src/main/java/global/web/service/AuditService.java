package global.web.service;

import java.util.List;

import global.mybatis.dto.Audit;

/**  
* @ClassName: AuditService  
* @Description: 审核表的Service
* @date 2018/10/26 17:22:26    
* 
*    
*/
public interface AuditService {
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
	void addAudit(Audit audit);
	
	/**  
	* @Title: updateAudit  
	* @Description: 改变审核结果 
	* @param audit    
	*/
	void updateAudit(Audit audit);
}
