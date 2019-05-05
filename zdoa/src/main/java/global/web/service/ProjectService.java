package global.web.service;

import java.util.List;

import global.help.PageBean;
import global.mybatis.dto.Project_table;

public interface ProjectService {

	/**
	 * @param pageSize 
	 * @param currentPage 
	 * @param map
	 * 首页展示/列表
	 * @throws Exception 
	 */	
	public PageBean<Project_table> findProject_table(Integer currentPage) throws Exception;
	
	 /**
	 * @param id
	 * 删除项目 
	 */ 
	public void deleteProject(Long id)throws Exception;
	/**
	 * @param id
	 * 根据id查询项目 
	 * 项目详情
	 */	
	public Project_table findProject_tableById(Long id)throws Exception;
	/**
	 * @param project_table
	 * 更新项目 
	 */	
	public void update(Project_table project_table)throws Exception;
	/**
	 * @param map
	 * 新建项目
	 */	
	public void addProject(Project_table project_table)throws Exception;
	/**
	 *
	 * @param project_table 
	 * 首页展示/列表
	 */	
	public List<Project_table> findProject_table(Project_table project_table)throws Exception;
	

}
