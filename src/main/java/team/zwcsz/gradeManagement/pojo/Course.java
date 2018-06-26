package team.zwcsz.gradeManagement.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * 课程实体类
 * @author 袁帅
 *
 */
@Entity
@Table(name="course")
public class Course implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=20)
	private String id;
	
	@Column(length=20)
	private String name;
	
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	
	@JoinColumn(name="student_id")
	private Student student;
	
	
}
