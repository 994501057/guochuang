package global.mybatis.mapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;


import global.mybatis.dto.Project_table;

public interface Project_tableMapper {
	 /**
	 * @param id
	 * 
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public Project_table findProject_tableById(long id);
	 /**
	 * @param project_table
	 * 项目管理首页 
	 */
	public List<Project_table> findProject_table(Project_table project_table);
	
	/**
	 * @param map
	 * 新建项目
	 * @throws IOException 
	 * @throws ServletException 
	 */	
	public void saveProject(Long id, String clientname, Long dictionary_id, Date startdate, Date enddate,
			String clientname2, String trade, String type, BigDecimal amount, BigDecimal tex, String contact,
			String phone, Long user_id, String createdBy, String status, Date createdDate, String modifiedBy,
			Date modifiedDate);
	 /**
	 * @param map
	 * 删除项目
	 * @throws IOException 
	 * @throws ServletException 
	 */ 
	public void deleteProject(long id);
	 /**
	 * @param map
	 * 修改项目
	 * @throws IOException 
	 * @throws ServletException 
	 */ 
	public void update(Project_table project_table);
	/**
	 * @param map
	 * 新建项目
	 * @throws IOException 
	 * @throws ServletException 
	 */	
	public void saveProject_table(Project_table project_table);
	/**
	 * @param map
	 * 统计项目总数
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public int countProject_table();
	 /**
	 * @param map
	 * 项目管理首页
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public List<Project_table> findProject_table();
	
	public List<global.mybatis.dto.Project_table> findProject_tables();

}
