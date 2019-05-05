package global.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import global.mybatis.dto.Project_user;
import global.mybatis.mapper.Project_userMapper;
import global.web.service.ProjectUserService;

@Service
public class Project_userServiceImpl implements ProjectUserService {
	@Autowired
	private Project_userMapper project_userMapper;
	/** 
	 * 增加项目人员
	 * @param project_user 
	 *
	 */
	@Override
	@Transactional
	public void addProjectUser(Project_user project_user) {
		project_userMapper.addProjectUser(project_user);
		

	}
	@Override
	@Transactional
	public void deleteProjectUser(Long id) {
		if(id!=null){
			project_userMapper.deleteProjectUser(id);
			
		}
		
	}

}
