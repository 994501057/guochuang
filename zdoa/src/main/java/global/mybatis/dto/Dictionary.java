package global.mybatis.dto;

import java.io.Serializable;
import java.util.Date;

public class Dictionary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1820706242032841574L;
	
	/**
	 *本表ID 
	 */
	private Long id ;
	
	/**
	 * 字段类型
	 */
	private String code;
	
	/**
	 * 字段名称
	 */
	private String name;
	
	/**
	 * 字段简介
	 */
	private String introduction ;
	
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

	public Dictionary() {
		super();
	}

	public Dictionary(Long id, String code, String name, String introduction, String created_by, Date created_date,
			String modified_by, Date modified_date) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.introduction = introduction;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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

	@Override
	public String toString() {
		return "Dictionary [id=" + id + ", code=" + code + ", name=" + name + ", introduction=" + introduction
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + "]";
	}

	
}
