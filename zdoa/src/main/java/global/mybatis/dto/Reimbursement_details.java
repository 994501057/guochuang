package global.mybatis.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**  
* @ClassName: reimbursement_details  
* @Description: 报销详情表实体类
* @date 2018/11/09 9:38:34    
* 
*    
*/
public class Reimbursement_details implements Serializable{
	
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**  
	* @Fields id : 报销详情表自增id
	*/  
	private long id ;
	
	/**  
	* @Fields time : 开支时间  
	*/  
	private Date time;
	
	/**  
	* @Fields project_id : 开支的项目ID  
	*/  
	private long project_id;
	
	/**  
	* @Fields remark : 具体说明  
	*/  
	private String remark;
	
	/**  
	* @Fields dictionary_id : 报销类型  
	*/  
	private long dictionary_id;
	
	/**  
	* @Fields amount : 报销金额  
	*/  
	private BigDecimal amount;
	
	/**  
	* @Fields reimbursement_id : 报销单单号  
	*/  
	private long reimbursement_id;

	/**
	 * 创建人
	 */
	private String created_by;

	/**
	 * 创建时间
	 */
	private Date created_date;
	
	/**
	 * 更新人
	 */
	private String modified_by;
	
	/**
	 * 更行时间
	 */
	private Date modified_date;

	public Reimbursement_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement_details(long id, Date time, long project_id, String remark, long dictionary_id,
			BigDecimal amount, long reimbursement_id, String created_by, Date created_date, String modified_by,
			Date modified_date) {
		super();
		this.id = id;
		this.time = time;
		this.project_id = project_id;
		this.remark = remark;
		this.dictionary_id = dictionary_id;
		this.amount = amount;
		this.reimbursement_id = reimbursement_id;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public long getProject_id() {
		return project_id;
	}

	public void setProject_id(long project_id) {
		this.project_id = project_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getDictionary_id() {
		return dictionary_id;
	}

	public void setDictionary_id(long dictionary_id) {
		this.dictionary_id = dictionary_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getReimbursement_id() {
		return reimbursement_id;
	}

	public void setReimbursement_id(long reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
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
