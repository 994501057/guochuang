package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**  
* @ClassName: Leave  
* @Description: 请假表实体
* @date 2018/10/26 18:12:43    
* 
*    
*/
public class Leave implements Serializable{
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**  
	*  id : 请假表审核  
	*/  
	private Long id ; 
	/**  
	*  dictionary_id : 请假类型id  
	*/  
	private Long dictionary_id;
	/**  
	*  remark : 请假说明  
	*/  
	private String remark;
	/**  
	*  startdate : 开始时间
	*/  
	private Date startdate;
	/**  
	*  enddate : 结束时间  
	*/  
	private Date enddate;
	/**  
	*  day : 请假天数
	*/  
	private Integer day;
	
	/**  
	*  state ：审批状态  
	*/  
	private String state;
	/**  
	*  created_by : 创建人  
	*/  
	private String created_by;
	/**  
	*  created_date : 创建时间  
	*/  
	private Date created_date;
	
	/**  
	* @Fields audit_users : 有多个人员来组成审批流程  
	*/  
	List<Audit_user> audit_users;
	
	/**  
	* 无参构造方法    
	*/
	public Leave() {
		super();
	}


	/**  
	* 有参构造 
	* @param id
	* @param dictionary_id
	* @param remark
	* @param startdate
	* @param enddate
	* @param day
	* @param state
	* @param created_by
	* @param created_date    
	*/
	public Leave(Long id, Long dictionary_id, String remark, Date startdate, Date enddate, Integer day, String state,
			String created_by, Date created_date, List<Audit_user> audit_users) {
		super();
		this.id = id;
		this.dictionary_id = dictionary_id;
		this.remark = remark;
		this.startdate = startdate;
		this.enddate = enddate;
		this.day = day;
		this.state = state;
		this.created_by = created_by;
		this.created_date = created_date;
		this.audit_users = audit_users;
	}
	
	/**  
	* @Title: getAudit_users  
	* @Description: 获取audit_users
	* @return    
	*/
	public List<Audit_user> getAudit_users() {
		return audit_users;
	}


	/**  
	* @Title: setAudit_users  
	* @Description: 给audit_users赋值   
	* @param audit_users    
	*/
	public void setAudit_users(List<Audit_user> audit_users) {
		this.audit_users = audit_users;
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
	* @Description: 给id赋值  
	* @param id    
	*/
	public void setId(long id) {
		this.id = id;
	}

	/**  
	* @Title: getId  
	* @Description: 获取dictionary_id
	* @return    
	*/
	public Long getDictionary_id() {
		return dictionary_id;
	}

	/**  
	* @Title: setDictionary_id  
	* @Description: 给dictionary_id赋值  
	* @param id    
	*/
	public void setDictionary_id(long dictionary_id) {
		this.dictionary_id = dictionary_id;
	}

	/**  
	* @Title: getRemark  
	* @Description: 获取remark
	* @return    
	*/
	public String getRemark() {
		return remark;
	}

	/**  
	* @Title: setRemark  
	* @Description: 给remark赋值  
	* @param id    
	*/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**  
	* @Title: getStartdate  
	* @Description: 获取startdate
	* @return    
	*/
	public Date getStartdate() {
		return startdate;
	}

	/**  
	* @Title: setStartdate  
	* @Description: 给startdate赋值  
	* @param id    
	*/
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	/**  
	* @Title: getEnddate  
	* @Description: 获取enddate
	* @return    
	*/
	public Date getEnddate() {
		return enddate;
	}

	/**  
	* @Title: setEnddate  
	* @Description: 给enddate赋值  
	* @param id    
	*/
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	/**  
	* @Title: getDay  
	* @Description: 获取day
	* @return    
	*/
	public Integer getDay() {
		return day;
	}

	/**  
	* @Title: setDay  
	* @Description: 给day赋值  
	* @param id    
	*/
	public void setDay(int day) {
		this.day = day;
	}

	/**  
	* @Title: getState  
	* @Description: 获取state
	* @return    
	*/
	public String getState() {
		return state;
	}

	/**  
	* @Title: setState  
	* @Description: 给state赋值  
	* @param id    
	*/
	public void setState(String state) {
		this.state = state;
	}

	/**  
	* @Title: getCreated_by  
	* @Description: 获取created_by
	* @return    
	*/
	public String getCreated_by() {
		return created_by;
	}

	/**  
	* @Title: setCreated_by  
	* @Description: 给created_by赋值  
	* @param id    
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
	* @Description: 给created_date赋值  
	* @param id    
	*/
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
	
	
}
