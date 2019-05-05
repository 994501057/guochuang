package global.mybatis.mapper;

import java.util.List;
import global.mybatis.dto.User;


public interface UserMapper {
	

	
	

	/**  
	* @Title: findUser  
	* @Description: 查询获得所有人员 
	* @return    
	*/
	List<User> findUser();
	
	/**  
	* @Title: findUserforid  
	* @Description: 通过ID获得人员  
	* @param id
	* @return    
	*/
	User findUserforid(long id);
	
	/**  
	* @Title: findUserfordivision_id  
	* @Description: 通过部门筛选人员
	* @param division_id
	* @return    
	*/
	List<User> findUserfordivision_id(long division_id);
	
	
	/*
	 * 查询人员总条数
	 * */
	int findUserByTotal();

	
	/*
	 * 
	 * 通过sn查询user
	 */
	User findBySn(String sn);

	/*
	 * 
	 * 添加人员
	 */
	void saveUser(User user);

	/*
	 * 
	 * 通过id查找user
	 */
	User findUserById(Long id);

	/*
	 * 
	 * 更新人员
	 */
	void updateUser(User user);

	List<User> findUserList(Long division_id);
	
}









