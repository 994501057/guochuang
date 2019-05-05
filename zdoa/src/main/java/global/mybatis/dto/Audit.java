package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;

/**  
* @ClassName: Audit  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/26 17:47:50    
* 
*    
*/
public class Audit implements Serializable{
	private static final long serialVersionUID = 1820706242032841574L;
	/**  
	* @Fields id : audit表id
	*/  
	private Long id;
	/**  
	* @Fields audit_id : 被审核表单id  
	*/  
	private Long audit_id; 
	/**  
	* @Fields user_id : 审核人id  
	*/  
	private Long user_id; 
	/**  
	* @Fields result : 审核结果 
	*/  
	private String result; 
	/**  
	* @Fields remark : 审核意见 
	*/  
	private String remark; 
	/**  
	* @Fields time : 审核时间
	*/  
	private Date time; 
	/**  
	* @Fields created_by : 创建人  
	*/  
	private String created_by;
	/**  
	* @Fields created_date : 创建时间 
	*/  
	private Date created_date; 
	/**  
	* @Fields modified_by : 更新者
	*/  
	private String modified_by; 
	/**  
	* @Fields modified_date : 更新时间
	*/  
	private Date modified_date;
	
	/**  
	* @Title: 无参构造方法      
	*/
	public Audit() {
		super();
	}

	/**  
	* @Title: 有参构造方法  
	* @param id
	* @param audit_id
	* @param user_id
	* @param result
	* @param remark
	* @param time
	* @param created_by
	* @param created_date
	* @param modified_by
	* @param modified_date    
	*/
	public Audit(Long id, Long audit_id, Long user_id, String result, String remark, Date time, String created_by,
			Date created_date, String modified_by, Date modified_date) {
		super();
		this.id = id;
		this.audit_id = audit_id;
		this.user_id = user_id;
		this.result = result;
		this.remark = remark;
		this.time = time;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}

	/**  
	* @Title: getId  
	* @Description: 获取 id
	* @return    
	*/
	public Long getId() {
		return id;
	}

	/**  
	* @Title: setId  
	* @Description: 赋值id 
	* @param id    
	*/
	public void setId(Long id) {
		this.id = id;
	}

	/**  
	* @Title: getAudit_id  
	* @Description: 获取audit_id
	* @return    
	*/
	public Long getAudit_id() {
		return audit_id;
	}

	/**  
	* @Title: setAudit_id  
	* @Description: 赋值audit_id  
	* @param audit_id    
	*/
	public void setAudit_id(Long audit_id) {
		this.audit_id = audit_id;
	}

	/**  
	* @Title: getUser_id  
	* @Description: 获取user_id
	* @return    
	*/
	public Long getUser_id() {
		return user_id;
	}

	/**  
	* @Title: setUser_id  
	* @Description: 赋值 user_id 
	* @param user_id    
	*/
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	/**  
	* @Title: getResult  
	* @Description: 获取result
	* @return    
	*/
	public String getResult() {
		return result;
	}

	/**  
	* @Title: setResult  
	* @Description: 赋值result  
	* @param result    
	*/
	public void setResult(String result) {
		this.result = result;
	}

	/**  
	* @Title: getRemark  
	* @Description: 获取 remark 
	* @return    
	*/
	public String getRemark() {
		return remark;
	}

	/**  
	* @Title: setRemark  
	* @Description: 赋值 remark
	* @param remark    
	*/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**  
	* @Title: getTime  
	* @Description: 获取time  
	* @return    
	*/
	public Date getTime() {
		return time;
	}

	/**  
	* @Title: setTime  
	* @Description: 赋值 time
	* @param time    
	*/
	public void setTime(Date time) {
		this.time = time;
	}

	/**  
	* @Title: getCreated_by  
	* @Description: 获取 created_by 
	* @return    
	*/
	public String getCreated_by() {
		return created_by;
	}

	/**  
	* @Title: setCreated_by  
	* @Description: 赋值created_by  
	* @param created_by    
	*/
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	/**  
	* @Title: getCreated_date  
	* @Description: 获取created_date
	* @return    
	*/
	public Date getCreated_date() {
		return created_date;
	}

	/**  
	* @Title: setCreated_date  
	* @Description: 赋值created_date  
	* @param created_date    
	*/
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	/**  
	* @Title: getModified_by  
	* @Description: 获取modified_by  
	* @return    
	*/
	public String getModified_by() {
		return modified_by;
	}

	/**  
	* @Title: setModified_by  
	* @Description: 赋值modified_by
	* @param modified_by    
	*/
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	/**  
	* @Title: getModified_date  
	* @Description: 获取modified_date
	* @return    
	*/
	public Date getModified_date() {
		return modified_date;
	}

	/**  
	* @Title: setModified_date  
	* @Description: 赋值modified_date  
	* @param modified_date    
	*/
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	
	
	
}
