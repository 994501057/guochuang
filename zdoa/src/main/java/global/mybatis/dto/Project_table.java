package global.mybatis.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

	/**
	 * 
	 * 项目表
	 * 
	 * @author a
	 *
	 */
	public class Project_table implements Serializable{
	private static final long serialVersionUID = 1820706242032841574L;
	/**ID
	
	 */
	private Long id;
	/**名称
	
	 */
	private String name;
	
	/**类别
	
	 */
	private Long dictionary_id;
	/**开始日期
	
	 */
	
	private Date startdate;
	/**结束日期
	
	 */
	
	private Date enddate;
	/**客户名称
	
	 */
	private String clientname;
	/**项目行业
	
	 */
	private String trade;
	/**项目类型
	
	 */
	private String	type;
	/**项目金额
	
	 */
	private BigDecimal amount;
	/**开票税点
	
	 */
	private BigDecimal tex;
	/**联系人
	
	 */
	private String contact;
	/**联系电话
	
	 */
	private String phone;
	/**项目负责人ID
	
	 */
	private Long user_id;
	/**项目状态
	
	 */
	private String 	status;
	/**创建者
	
	 */
	private String	createdBy;
	/**创建日期
	
	 */

	private Date	createdDate;
	/**更新者
	
	 */
	private String	modifiedBy;
	/**更新日期
	
	 */
	
	private Date modifiedDate;
	/**项目负责人姓名
	
	 */
	private String username;
      /**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
       * toString方法	
	 */
	@Override
	public String toString() {
		return "Project_table [id=" + id + ", name=" + name + ", dictionary_id=" + dictionary_id + ", startdate="
			+ startdate + ", enddate=" + enddate + ", clientname=" + clientname + ", trade=" + trade + ", type=" + type
			+ ", amount=" + amount + ", tex=" + tex + ", contact=" + contact + ", phone=" + phone + ", user_id="
			+ user_id + ", status=" + status + ", createdBy=" + createdBy + ", createdDate=" + createdDate
			+ ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate + "]";
	}
	/**获取ID
	 * @return  id
	 * ID
	 */
	public Long getId() {
		return id;
	}
	/**设置ID
	 * @param  id
	 * ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**获取名称
	 * @return  name
	 * 名称
	 */	
	public String getName() {
		return name;
	}	
	/**设置名称
	 * @param  name
	 * 名称
	 */
	public void setName(String name) {
		this.name = name;
	}	
	/**获取类别
	 * @return  dictionary_id
	 * 类别
	 */
	public Long getDictionary_id() {
		return dictionary_id;
	}	
	/**设置类别
	 * @param  dictionary_id
	 * 类别
	 */
	public void setDictionary_id(Long dictionary_id) {
		this.dictionary_id = dictionary_id;
	}	
	/**获取开始时间
	 * @return  startdate
	 * 开始时间
	 * 
	 */
	public Date getStartdate() {
		return startdate;
	}	
	/**设置开始时间
	 * @param  startdate
	 * 开始时间
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}	
	/**获取结束时间
	 * @param  enddate
	 * 结束时间
	 */
	public Date getEnddate() {
		return enddate;
	}	
	/**设置结束时间
	 * @param  enddate
	 *  结束时间
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}	
	/**获取客户名称
	 * @return  clientname
	 * 客户名称
	 */
	public String getClientname() {
		return clientname;
	}	
	/**设置客户名称
	 * @param  clientname
	 * 客户名称
	 */
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}	
	/**获取项目行业
	 * @return  trade
	 * 项目行业
	 */
	public String getTrade() {
		return trade;
	}	
	/**设置项目行业
	 * @param trade
	 * 项目行业
	 */
	public void setTrade(String trade) {
		this.trade = trade;
	}	
	/**获取项目类型
	 * @return  type
	 * 项目类型
	 */
	public String getType() {
		return type;
	}	
	/**获取项目类型
	 * @param  type
	 * 项目类型
	 */
	public void setType(String type) {
		this.type = type;
	}	
	/**获取项目金额
	 * @return  amount
	 * 项目金额
	 */
	public BigDecimal getAmount() {
		return amount;
	}	
	/**设置项目金额
	 * @param amount
	 * 项目金额
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}	
	/**获取开票税点
	 * @return  tex
	 * 开票税点
	 */
	public BigDecimal getTex() {
		return tex;
	}	
	/**设置开票税点
	 * @param  tex
	 * 开票税点
	 */
	public void setTex(BigDecimal tex) {
		this.tex = tex;
	}	
	/**获取联系人
	 * @return  contact
	 * 联系人
	 */
	public String getContact() {
		return contact;
	}	
	/**设置联系人
	 * @param  contact
	 * 联系人
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}	
	/**获取电话
	 * @return  phone
	 * 电话
	 */
	public String getPhone() {
		return phone;
	}	
	/**设置电话
	 * @param  phone
	 * 电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}	
	/**获取项目负责人ID
	 * @return  user_id
	 * 项目负责人ID
	 */
	public Long getUser_id() {
		return user_id;
	}	
	/**设置user_id
	 * @param  user_id
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}	
	/**获取项目状态
	 * @return  status
	 * 项目状态
	 */
	public String getStatus() {
		return status;
	}	
	/**设置项目状态
	 * @param  status
	 * 项目状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}	
	/**获取创建者
	 * @return  createdBy
	 * 创建者
	 */
	public String getCreatedBy() {
		return createdBy;
	}	
	/**设置创建者
	 * @param  createdBy
	 * 创建者
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}	
	/**获取  创建日期  
	 * @return  createdDate 
	 * 创建日期
	 */
	public Date getCreatedDate() {
		return createdDate;
	}	
	/**设置创建日期    
	 * @param  createdDate 
	 * 创建日期
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}	
	/**获取 更新者   
	 * @return  modifiedBy  
	 * 更新者
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**设置更新者
	 * @param  modifiedBy   
	 * 更新者
	 */
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}	
	/**获取更新日期    
	 * @return  modifiedDate
	 * 更新日期
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}	
	/** 设置更新日期
	 * @param  modifiedDate
	 *  更新日期
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}	
	/**
	 * 
	 * 
	 * 无参构造函数
	 */
	public Project_table() {
		super();
		
	}
	
	}


