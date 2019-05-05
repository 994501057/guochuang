package global.mybatis.mapper;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import global.mybatis.dto.Project_user;

public interface Project_userMapper {
	 /**
	 * @param map
	 * 项目管理首页
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public List<Project_user> findProjectUser();
	 /**
	 * @param map
	 * 项目人员详情
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public Project_user findProjectUser(long id);
	 /**
	 * @param map
	 * 根据project_id详情
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public List<Project_user> findProjectIdById(long project_id);
	
	
	 /**
	 * @param map
	 * 删除项目开发人员
	 * @throws IOException 
	 * @throws ServletException 
	 */ 
	public void deleteProjectUser(Long id);
	 /**
	 * @param map
	 * 根据项目id删除相关开发人员
	 * @throws IOException 
	 * @throws ServletException 
	 */ 
	public void deleteProjectUserById(Long id);
	 /**
		 * @param map
		 * 更新项目人员表
		 * @throws IOException 
		 * @throws ServletException 
		 */ 
	public void updateProjectUser(Project_user projectUser);
	/**
	 * @param map
	 * 新建项目
	 * @throws IOException 
	 * @throws ServletException 
	 */	
	public void addProjectUser(Project_user project_user);

}
