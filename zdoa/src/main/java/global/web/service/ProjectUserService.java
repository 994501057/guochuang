package global.web.service;

import global.mybatis.dto.Project_user;

public interface ProjectUserService {
	/** 
	 * 增加项目人员
	 * @param project_user 
	 *
	 */
	void addProjectUser(Project_user project_user);

	void deleteProjectUser(Long id);
	

}
