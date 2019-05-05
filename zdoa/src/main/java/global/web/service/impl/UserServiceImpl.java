package global.web.service.impl;

import java.util.Date;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import global.help.DateUtils;
import global.help.PageBean;
import global.mybatis.dto.User;
import global.mybatis.mapper.UserMapper;
import global.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserMapper userMapper;
	
	
	/*
	 *查询人员编号信息
	 *
	 */
	@Override
	public User findBySn(String sn) {
		
		return userMapper.findBySn(sn);
	}

	/*
	 *新增人员
	 *
	 */
	@Override
	public void saveUser(User user) {
		//给密码设置md5值
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		//设置日期格式		
		String formate = DateUtils.formate(user.getInductionDate());
		Date date = DateUtils.parse(formate);
		user.setInductionDate(date);
        userMapper.saveUser(user);
	}

	/*
	 *修改人员
	 *
	 */
	@Override
	public void updateUser(User user) {
		//给密码设置md5值
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
         userMapper.updateUser(user);
	}


	/*
	 *查看人员详情
	 *
	 */
	@Override
	public User userDetail(Long id) {
		
		
		return userMapper.findUserById(id);
	}


	/*
	 *查看人员列表
	 *
	 */
	@Override
	public List<User> findUser(Integer currentPage, Integer pageSize) {
		//设定开始页数和分页条数
		PageHelper.startPage(currentPage, pageSize);
				//查询所有
				List<User> userList  = userMapper.findUser();
				//查询总数
				int count= userMapper.findUserByTotal(); 
				//分页开始
				PageBean<User> page=new PageBean<>(currentPage,pageSize,count);
				page.setUser(userList);
				return page.getUser();
	}

	@Override
	public List<User> findUserList(Long id) {
		
		return userMapper.findUserList(id);
	}




	

	





}
