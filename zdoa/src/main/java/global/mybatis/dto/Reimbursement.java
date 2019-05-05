package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;

/**  
* @ClassName: reimbursement  
* @Description: 报销表实体类
* @date 2018/11/09 9:28:54    
* 
*    
*/
public class Reimbursement implements Serializable{
	
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**  
	* @Fields id : 报销表自增id
	*/  
	private long id ;
	
	/**  
	* @Fields sn : 报销发票号  
	*/  
	private String sn;
	
	/**  
	* @Fields time : 报销时间  
	*/  
	private Date time;
	
	/**  
	* @Fields type : 申请人类型  
	*/  
	private String type;
	
	/**  
	* @Fields status : 审批状态  
	*/  
	private String status;
	
	/**
	 * 创建人
	 */
	private String created_by;

	/**
	 * 创建时间
	 */
	private Date created_date;
	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(long id, String sn, Date time, String type, String status, String created_by,
			Date created_date) {
		super();
		this.id = id;
		this.sn = sn;
		this.time = time;
		this.type = type;
		this.status = status;
		this.created_by = created_by;
		this.created_date = created_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

}
