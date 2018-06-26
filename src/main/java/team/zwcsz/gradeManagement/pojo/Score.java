package team.zwcsz.gradeManagement.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 成绩实体类
 * @author 袁帅
 *
 */
@Entity
@Table(name="score")
public class Score implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length=20)
	private String stuId;
	
	@Id
	@Column(length=20)
	private String teacherId;
	
	@Id
	@Column(length=20)
	private String courseId;
	
	@Column(length=20)
	private String score;

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [stuId=" + stuId + ", teacherId=" + teacherId + ", courseId=" + courseId + ", score=" + score
				+ "]";
	}
	
	
}
