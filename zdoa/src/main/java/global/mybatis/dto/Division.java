package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;

/**  
* @ClassName: division  
* @Description: TODO(这里用一句话描述这个类的作用)
* @date 2018/10/25 13:24:49    
*    
*/
public class Division implements Serializable{
	/**  
	* @Fields id : 部門ID  
	*/  
	private Long id;
	
	/**  
	* @Fields name : 部門名字  
	*/  
	private String name;
	
	/**  
	* @Fields status : 部門狀態  
	*/  
	private String status;
	
	/**  
	* @Fields created_by : 創建人  
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

	public Division() {
		super();
	}

	public Division(Long id, String name, String status, String created_by, Date created_date, String modified_by,
			Date modified_date) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
