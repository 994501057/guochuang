package global.mybatis.dto;

import java.io.Serializable;
import java.util.List;

/**  
* @ClassName: LeaveAll  
* @Description:整合所需要的实体leave
* @date 2018/11/06 14:06:38    
* 
*    
*/
public class LeaveAll implements Serializable{
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**  
	*  leave : 请假单详情  
	*/  
	private Leave leave ;
	
	/**  
	*  audit : 审核表结果 
	*/  
	private List<Audit> audits;

	/**  
	* 无参构造  
	*/
	public LeaveAll() {
		super();
	}

	/**  
	* 有参构造 
	* @param leave ：  请假表
	* @param audits ： 审核结果表    
	*/
	public LeaveAll(Leave leave, List<Audit> audits) {
		super();
		this.leave = leave;
		this.audits = audits;
	}

	/**  
	* @Title: getLeave  
	* @Description: 获取请假表
	* @return    
	*/
	public Leave getLeave() {
		return leave;
	}

	/**  
	* @Title: setLeave  
	* @Description: 赋值请假表  
	* @param leave    
	*/
	public void setLeave(Leave leave) {
		this.leave = leave;
	}

	/**  
	* @Title: getAudits  
	* @Description: 获取请假表
	* @return    
	*/
	public List<Audit> getAudits() {
		return audits;
	}

	/**  
	* @Title: setAudits  
	* @Description: 赋值请假表   
	* @param audits    
	*/
	public void setAudits(List<Audit> audits) {
		this.audits = audits;
	}

	
	
}
