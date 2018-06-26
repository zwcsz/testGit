package team.zwcsz.gradeManagement.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 专业实体类
 * @author 袁帅
 *
 */
@Entity
@Table(name="major")
public class Major implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=11)
	private String id;
	
	
	@Column(length=20)
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Major [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
