package global.web.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import global.help.DateUtils;
import global.mybatis.dto.Audit;
import global.mybatis.dto.Leave;
import global.mybatis.dto.LeaveAll;
import global.mybatis.dto.User;
import global.mybatis.mapper.AuditMapper;
import global.mybatis.mapper.LeaveMapper;
import global.web.service.AuditService;
import global.web.service.LeaveService;

/**  
* @ClassName: LeaveServiceImpl  
* @Description:请假表的Service层
* @date 2018/10/30 14:01:51    
*/
@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired 
	private LeaveMapper leaveMapper;
	
	@Autowired
	private AuditMapper auditMapper;
	
	@Autowired
	AuditService auditService;


	/**  
	* @Title: updateLeaveById  
	* @Description:修改请假表
	* @param id
	* @param dictionary_id
	* @param remark
	* @param startdate
	* @param enddate
	* @param day
	* @see global.web.service.LeaveService#updateLeaveById(long, long, java.lang.String, java.util.Date, java.util.Date, int)
	*/
	@Override
	public void updateLeaveById(Leave leave) {
		// TODO Auto-generated method stub
		leaveMapper.updateLeaveById(leave);
	}

	/**  
	* @Title: addLeave  
	* @Description: 添加请假表  
	* @param dictionary_id
	* @param remark
	* @param startdate
	* @param enddate
	* @param day
	* @see global.web.service.LeaveService#addLeave(long, java.lang.String, java.util.Date, java.util.Date, int)
	*/
	@Override
	public void addLeave(Leave leave) {
		//获取当前人员
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		leave.setCreated_by(user.getUsername());
		//获取当前时间
		Date date = new Date();
		leave.setCreated_date(DateUtils.parse(DateUtils.formate(date)));
		leaveMapper.addLeave(leave);
	}

	/**  
	* @Title: findLeaveAndexamineforWeb  
	* @Description: 将所有休假表单及相关详情查询出来    
	* @param leave_id
	* @return
	* @see global.web.service.LeaveService#findLeaveAndexamineforWeb(long)
	*/
	@Override
	public List<LeaveAll> findLeaveAndexamineforWeb() {
		// 创建实体类
		List<LeaveAll> leaveAlls = new ArrayList();
		LeaveAll leaveAll = new LeaveAll();
		
		//获取所有请假表对象
		List<Leave> findLeaveBytimeAndNameAndType = leaveMapper.findAllLeave(leaveAll.getLeave());
		//获取每张表相应的其他信息
		for (Leave leave : findLeaveBytimeAndNameAndType) {
			//用AuditService进行排序
			List<Audit> audits = auditService.findAuditfromAudit_Id(leave.getId());
			
			//封装入对象
			leaveAll.setLeave(leave);
			leaveAll.setAudits(audits);
			
			//加入数组
			leaveAlls.add(leaveAll);
		}
		return leaveAlls;
	}

	/**  
	* @Title: findLeaves  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param leave
	* @return
	* @see global.web.service.LeaveService#findLeaves(global.mybatis.dto.Leave)
	*/
	@Override
	public List<LeaveAll> findLeaves(Leave leave) {
		// TODO Auto-generated method stub
		return null;
	}

	/**  
	* @Title: deleteLeaveAndexamineforWeb  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param leave
	* @see global.web.service.LeaveService#deleteLeaveAndexamineforWeb(global.mybatis.dto.Leave)
	*/
	@Override
	public void deleteLeaveAndexamineforWeb(Leave leave) {
		//获取所有请假表对象
		//判断是否有此对象
		if (leave!=null) {
			//删除相应的数据
			auditMapper.deleteAuditsByAudit_id(leave.getId());
			leaveMapper.deleteLeaveById(leave.getId());
		}	
	}

	

}
