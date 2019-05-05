package global.web.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import global.mybatis.dto.Audit;
import global.mybatis.dto.Audit_user;
import global.mybatis.dto.Dictionary;
import global.mybatis.dto.Leave;
import global.mybatis.dto.User;
import global.mybatis.mapper.AuditMapper;
import global.mybatis.mapper.Audit_userMapper;
import global.mybatis.mapper.DictionaryMapper;
import global.mybatis.mapper.LeaveMapper;
import global.web.service.AuditService;

/**  
* @ClassName: AuditServiceImpl  
* @Description: 审核结果的Service层
* @date 2018/10/26 17:23:48    
* 
*    
*/
@Service
public class AuditServiceImpl implements AuditService{
	
	@Autowired
	private AuditMapper auditMapper;
	
	@Autowired
	private Audit_userMapper audit_userMapper;
	
	@Autowired
	private LeaveMapper leaveMapper;

	@Autowired
	private DictionaryMapper dictionaryMapper;
	/**  
	* @Title: findAuditfromAudit_Id  
	* @Description: 通过表单号获取审核结果并进行排序
	* @param audit_id
	* @return
	* @see global.web.service.AuditService#findAuditfromAudit_Id(long)
	*/
	@Override
	public List<Audit> findAuditfromAudit_Id(long audit_id) {
//		List<Audit> findAuditfromAudit_Id = auditMapper.findAuditfromAudit_Id(audit_id);
//		//获取表对象来判断它走的是什么流程
//		Leave leave = leaveMapper.findLeaveById(audit_id);
//		//获取请假类型
//		Dictionary dictionary = dictionaryMapper.(leave.getDictionary_id());
//		//获取人员部门
//		User user = (User) SecurityUtils.getSubject().getPrincipal();
//		
//		//搜索对应流程
//		List<Audit_user> aduit_users = audit_userMapper.findAudit_userByDivision_idAndTypeAndUser_id(user.getDivision_id(),dictionary.getName() , 0);
//		
//		//开始排序
//		Collections.sort(aduit_users,new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				// TODO Auto-generated method stub
//				if (o1 instanceof Audit_user && o2 instanceof Audit_user) {
//					Audit_user a1 = (Audit_user)o1;
//					Audit_user a2 = (Audit_user)o2;
//					return a1.getLevel()-a2.getLevel();
//				}
//					throw new ClassCastException("不能转换为Emp类型");
//				}
//			});
//		System.out.println("组织架构排序成功");
//		
//		return findAuditfromAudit_Id;
		return null ;
	}

	/**  
	* @Title: findAuditfromId  
	* @Description: 通过id获取审核结果 
	* @param id
	* @return
	* @see global.web.service.AuditService#findAuditfromId(long)
	*/
	@Override
	public Audit findAuditfromId(long id) {
		// TODO Auto-generated method stub
		Audit findAuditfromId = auditMapper.findAuditfromId(id);
		return findAuditfromId;
	}

	/**  
	* @Title: addAudit  
	* @Description: 添加审核结果   
	* @param audit
	* @see global.web.service.AuditService#addAudit(global.mybatis.dto.Audit)
	*/
	@Override
	public void addAudit(Audit audit) {
		// TODO Auto-generated method stub
		auditMapper.addAudit(audit.getAudit_id(),audit.getUser_id(),audit.getResult(),audit.getRemark(),audit.getTime(),audit.getCreated_by(),audit.getCreated_date(),audit.getModified_by(),audit.getModified_date());
	}

	/**  
	* @Title: updateAudit  
	* @Description: 改变审核结果 
	* @param audit
	* @see global.web.service.AuditService#updateAudit(global.mybatis.dto.Audit)
	*/
	@Override
	public void updateAudit(Audit audit) {
		// 查看是否有该数据
		Audit findAuditfromId = auditMapper.findAuditfromId(audit.getId());
		if (findAuditfromId!=null) {
			auditMapper.updateAudit(audit.getAudit_id(),audit.getUser_id(),audit.getResult(),audit.getRemark(),audit.getTime(),audit.getModified_by(),audit.getModified_date());
		}
	}

}
