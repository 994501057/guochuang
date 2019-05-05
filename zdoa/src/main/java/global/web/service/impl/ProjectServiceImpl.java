package global.web.service.impl;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import global.help.PageBean;
import global.mybatis.dto.Project_table;
import global.mybatis.mapper.Project_tableMapper;
import global.mybatis.mapper.Project_userMapper;
import global.web.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private Project_tableMapper project_tableMapper;
	@Autowired
	private Project_userMapper project_userMapper;
	 /**
	 * @param map
	 * 项目管理首页
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@Override
	@Transactional
	public PageBean<Project_table> findProject_table(Integer currentPage)throws Exception{
		//设定开始页数和分页条数
		PageHelper.startPage(currentPage, 5);
		//查询所有
		List<Project_table> project_table  = project_tableMapper.findProject_tables();
		//查询总数
		int countProject_table= project_tableMapper.countProject_table(); 
		//分页开始
		PageBean<Project_table> page=new PageBean<>(currentPage,5,countProject_table);
		page.setProject_table(project_table);
		return page;	
	}	
	 /**
	 * @param id：project_id
	 * 删除项目
	 * 根据项目id删除项目人员表
	 */ 
	@Override
	@Transactional
	public void deleteProject(Long id) throws Exception{
		if(id!=0&&id!=null){
			//刪除項目表
			project_tableMapper.deleteProject(id);
			//刪除该项目的项目人员
			project_userMapper.deleteProjectUserById(id);
		}		
	}
	/**
	 * @param id 
	 * 根据id查询项目 
	 * 项目详情
	 */
	@Override
	@Transactional
	public Project_table findProject_tableById(Long id)throws Exception {
		if(id!=0&&id!=null){
			Project_table findProject_tableById = project_tableMapper.findProject_tableById(id);
			return findProject_tableById;
		}else{
			Project_table findProject_tableById = project_tableMapper.findProject_tableById(id);
			return findProject_tableById;
		}
		
				
    }	
	 /**
	 * @param project_table
	 * 修改项目 
	 */ 
	@Override
	@Transactional
	public void update(Project_table project_table)throws Exception{
		if(project_table!=null){
			//更新项目表
			project_tableMapper.update(project_table);
		}
	}	
	/**
	 * @param project_table
	 * 新增项目 
	 */ 
	@Override
	@Transactional
	public void addProject(Project_table project_table)throws Exception{
		if(project_table!=null){
			//新增项目
			project_tableMapper.saveProject_table(project_table);
		}
		
	}
	 /**
	 * @param map
	 * 项目管理首页
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@Override
	@Transactional
	public List<Project_table> findProject_table(Project_table project_table)throws Exception {
		if(project_table!=null){
			return project_tableMapper.findProject_table(project_table);
		}else{
			return null;
		}
		
		
	}

}
