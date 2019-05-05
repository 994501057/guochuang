package global.web.service;

import java.util.List;

import global.mybatis.dto.Division;

/**  
* @ClassName: DivisionService  
* @Description: 部们实现类
* @date 2018/10/25 15:18:11    
*    
*/
public interface DivisionService {
	/**  
	* @Title: findDivisions  
	* @Description: 获得所有部门内容 
	* @return    
	*/
	List<Division> findDivisions(Division division);
	
	/**  
	* @Title: updateDivisionfromid  
	* @Description:通过ID修改部门  
	* @param id
	* @param name
	* @param status
	* @param created_by
	* @param created_date
	* @param modified_by
	* @param modified_date    
	*/
	void updateDivisionfromId(Division division);
	
	/**  
	* @Title: deleteDivisionfromId  
	* @Description: 通过ID删除Division  
	* @param id    
	*/
	void deleteDivisionfromId(Division division);
	
	/**  
	* @Title: addDivision  
	* @Description: 添加Division
	* @param name
	* @param status
	* @param created_by
	* @param created_date
	* @param modified_by
	* @param modified_date    
	*/
	void addDivision(Division division);
}
