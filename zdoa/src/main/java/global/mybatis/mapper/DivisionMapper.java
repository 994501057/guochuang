package global.mybatis.mapper;

import java.util.List;

import global.mybatis.dto.Division;

/**  
* @ClassName: Division  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/25 13:36:35    
*    
*/
public interface DivisionMapper {
	/**  
	* @Title: findDivisions  
	* 获得所有部门内容 
	* 通过id获得内容 
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
	void deleteDivisionfromId(Long id);
	
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
	
	/**  
	* @Title: findDivisionById  
	* @Description: 通过id获得Division 
	* @param id
	* @return    
	*/
	Division findDivisionById(Long id);
}
