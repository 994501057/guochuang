package global.web.service;


import java.util.List;
import global.mybatis.dto.User;


public interface UserService  {
	
	
	
	/*
	 * 查询用户的编号
	 */
	User findBySn(String sn);

	

	/*
	 * 新增人员
	 */
	void saveUser(User user);

	/*
	 * 修改人员
	 */
	void updateUser(User user);

	/*
	 * 人员详情
	 */

	User userDetail(Long id);

	/*
	 *分页查询人员信息
	 */
	List<User> findUser(Integer currentPage, Integer pageSize);



	List<User> findUserList(Long id);



	

	

	

	

	
}