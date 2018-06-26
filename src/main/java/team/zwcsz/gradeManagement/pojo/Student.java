package team.zwcsz.gradeManagement.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * 学生实体类
 * @author 袁帅
 *
 */
@Entity
@Table(name="student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length=11)
	private String id;
	
	@Column(length=11)
	private String name;
	
	@Column(length=2)
	private String sex;
	
	@Column(length=16)
	private String password;	
		

	@JoinColumn(name="major_id")
	private Major major;
	
	@JoinColumn(name="grade_id")
	private Grade grade;
	
	@JoinColumn(name="class_id")
	private Class Classes;
	
	@JoinColumn(name="course_id")
	private Course course;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Class getClasses() {
		return Classes;
	}

	public void setClasses(Class classes) {
		Classes = classes;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", password=" + password + ", major=" + major
				+ ", grade=" + grade + ", Classes=" + Classes + ", course=" + course + "]";
	}
	
	
	
}
