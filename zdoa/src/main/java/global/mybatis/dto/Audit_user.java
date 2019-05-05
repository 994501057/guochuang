package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**  
* @ClassName: Aduit_user  
* @Description: 审核的人员结构的实体类
* @date 2018/11/02 14:05:45    
* 
*    
*/
public class Audit_user implements Serializable{
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**  
	* @Fields id : 表单自增ID
	*/  
	private Long id ;
	
	/**  
	* @Fields division_id : 部门ID  
	*/  
	private Long division_id;
	
	/**  
	* @Fields user_id : 审批人员id
	*/  
	private Long user_id;
	
	/**  
	* @Fields level : 审核序列  
	*/  
	private Integer level;
	
	/**  
	* @Fields type : 审核表类型 
	*/  
	private String type;
	
	/**  
	* @Fields created_by : 创建人  
	*/  
	private String created_by;
	
	/**  
	* @Fields created_date : 创建日期  
	*/  
	private Date created_date;
	
    /**  
    * @Fields modified_by : 更新人员
    */  
    private String modified_by;	
    
    /**  
    * @Fields modified_date : 修改时间
    */  
    private Date modified_date;
    
    /**  
    * @Fields audits : 多个表的审批  
    */  
    List<Audit> audits;

	/**  
	* @Title: 无参构造     
	*/
	public Audit_user() {
		super();
	}

	/**  
	* @Title: 有参构造  
	* @param id
	* @param division_id
	* @param user_id
	* @param level
	* @param type
	* @param created_by
	* @param created_date
	* @param modified_by
	* @param modified_date    
	*/
	public Audit_user(Long id, Long division_id, Long user_id, Integer level, String type, String created_by,
			Date created_date, String modified_by, Date modified_date, List<Audit> audits) {
		super();
		this.id = id;
		this.division_id = division_id;
		this.user_id = user_id;
		this.level = level;
		this.type = type;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
		this.audits = audits;
	}

	/**  
	* @Title: getId  
	* @Description: 获取id  
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
	* @Title: getDivision_id  
	* @Description: 获取 division_id
	* @return    
	*/
	public Long getDivision_id() {
		return division_id;
	}

	/**  
	* @Title: setDivision_id  
	* @Description: 赋值division_id  
	* @param division_id    
	*/
	public void setDivision_id(Long division_id) {
		this.division_id = division_id;
	}

	/**  
	* @Title: getUser_id  
	* @Description: 获取  user_id
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
	* @Title: getLevel  
	* @Description: 获取level
	* @return    
	*/
	public Integer getLevel() {
		return level;
	}

	/**  
	* @Title: setLevel  
	* @Description: 赋值 level
	* @param level    
	*/
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**  
	* @Title: getType  
	* @Description: 获取type
	* @return    
	*/
	public String getType() {
		return type;
	}

	/**  
	* @Title: setType  
	* @Description: 赋值type
	* @param type    
	*/
	public void setType(String type) {
		this.type = type;
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
	* @Description: 赋值 modified_by 
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

	/**  
	* @Title: getAudits  
	* @Description: 获取audits    
	* @return    
	*/
	public List<Audit> getAudits() {
		return audits;
	}

	/**  
	* @Title: setAudits  
	* @Description: 赋值audits
	* @param audits    
	*/
	public void setAudits(List<Audit> audits) {
		this.audits = audits;
	}

}
