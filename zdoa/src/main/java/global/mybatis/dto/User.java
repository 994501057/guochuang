package global.mybatis.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户
 */
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**
	 * ID
	 */
	private Long id;
	
	
	/**
	 * 编号
	 */
	private String sn;
	
	/**
	 * 入职日期
	 */
	private Date inductionDate;
	
	/**
	 * 员工性别
	 */
	private String sex;
	
	/**
	 * 身份证号码
	 */
	private String idcard;
	
	/**
	 * 人员薪资
	 */
	private BigDecimal salary;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 姓名
	 */
	private String username;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 部门ID
	 */
	private Long division_id;

	/**
	 * 角色ID
	 */
	private Long role_id;
	
	/**  
	* @Fields created_by : 创建人
	*/  
	private String created_by;
	
	/**  
	* @Fields created_date : 创建时间  
	*/  
	private Date created_date;
	
	/**  
	* @Fields modified_by : 更新人  
	*/  
	private String modified_by;
	
	/**  
	* @Fields modified_date : 更新时间  
	*/  
	private Date modified_date;

	public User() {
		super();
	}

	public User(Long id, String sn, Date inductionDate, String sex, String idcard, BigDecimal salary, String password,
			String username, String status,Long division_id, Long role_id, String created_by, Date created_date,
			String modified_by, Date modified_date) {
		super();
		this.id = id;
		this.sn = sn;
		this.inductionDate = inductionDate;
		this.sex = sex;
		this.idcard = idcard;
		this.salary = salary;
		this.password = password;
		this.username = username;
		this.status = status;
		this.division_id = division_id;
		this.role_id = role_id;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Date getInductionDate() {
		return inductionDate;
	}

	public void setInductionDate(Date inductionDate) {
		this.inductionDate = inductionDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getDivision_id() {
		return division_id;
	}

	public void setDivision_id(long division_id) {
		this.division_id = division_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	
	
}
