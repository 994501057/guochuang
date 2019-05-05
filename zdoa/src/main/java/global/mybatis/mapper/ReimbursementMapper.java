package global.mybatis.mapper;

import java.util.List;

import global.mybatis.dto.Reimbursement;

/**  
* @ClassName: reimbursementMapper  
* @Description: 报销表Mapper
* @date 2018/11/09 11:03:36    
*    
*/
public interface ReimbursementMapper {
	/**  
	* @Title: findAllReimbursements  
	* @Description: 获取所有报销表  
	* @return    
	*/
	List<Reimbursement> findAllReimbursements(); 
	
	/**  
	* @Title: findReimbursements  
	* @Description: 通过ID来查找对象  
	* @param id
	* @return    
	*/
	Reimbursement findReimbursementById(long id);
	
	/**  
	* @Title: deleteReimbursementById  
	* @Description: 通过ID删除报销表  
	* @param id    
	*/
	void deleteReimbursementById(long id);
	
	/**  
	* @Title: addReimbursement  
	* @Description: 获取对象
	* @param reimbursement    
	*/
	void addReimbursement(Reimbursement reimbursement);
}
