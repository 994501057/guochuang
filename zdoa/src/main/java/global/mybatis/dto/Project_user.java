package global.mybatis.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

	/**
	 * 
	 * 项目人员
	 * 
	 * @author a
	 *
	 */

public class Project_user {
    /**ID
	
	 */
	private Long id;
    /**项目ID
	
	 */	
	private Long project_id;
   /**开发人员ID
	
	 */
	private Long user_id;//
   /**开始时间
	
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date starttime;
	/**结束时间
	
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endtime;
	/**创建者
	
	 */
	private String createdBy;
	/**创建日期
	
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdDate;
	/**更新者
	
	 */
	private String modifiedBy;
	/**更新日期
	
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date modifiedDate;
	/**获取ID
	 * @return  id
	 * ID
	 */
	public Long getID() {
		return id;		
	}
	/**设置ID
	 * @param  id
	 * ID
	 */
	public void setID(Long id) {
		this.id = id;
	}
	/**获取项目id
	 * @return  project_id
	 * 项目id
	 */
	public Long getProject_id() {
		return project_id;
	}
	/**设置项目id
	 * @param  project_id
	 * 项目id
	 */
	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}
	/**获取开发人员id
	 * @return  user_id
	 * 开发人员id
	 */
	public Long getUser_id() {
		return user_id;
	}
	/**设置开发人员id
	 * @param  user_id
	 * 开发人员id
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	/**获取开始日期
	 * @return  starttime
	 * 开始日期
	 */
	public Date getStarttime() {
		return starttime;
	}
	/**设置开始日期
	 * @param  starttime
	 * 开始日期
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	/**获取结束日期
	 * @return  endtime
	 * 结束日期
	 */
	public Date getEndtime() {
		return endtime;
	}
	/**设置结束日期
	 * @param  endtime
	 * 结束日期
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	/**获取创建人
	 * @return  createdBy
	 * 创建人
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**设置创建人
	 * @param  createdBy
	 *	创建人
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**获取创建日期
	 * @return  createdDate
	 * 创建日期
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**设置创建日期
	 * @param  createdDate
	 *	创建日期
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**获取更新者
	 * @return  modifiedBy
	 * 更新者
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}
	/**设置更新者
	 * @param  modifiedBy
	 *	更新者
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
	/**设置更新日期
	 * @param  modifiedDate
	 *	更新日期
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	/**
	 * 有参构造	
	 */
	public Project_user(Long iD, Long project_id, Long user_id, Date starttime, Date endtime, String createdBy,
			Date createdDate, String modifiedBy, Date modifiedDate) {
		super();
		id = iD;
		this.project_id = project_id;
		this.user_id = user_id;
		this.starttime = starttime;
		this.endtime = endtime;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	/**
	 * 无参构造	
	 */
	public Project_user() {
		super();	
	}
	
	
	
}
