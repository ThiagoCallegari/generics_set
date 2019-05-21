package entities;

public class Teacher {

	private String teacherName;
	private Integer numberOfCourses;
	
	public Teacher() {
	}

	public Teacher(String teacherName, Integer numberOfCourses) {
		this.teacherName = teacherName;
		this.numberOfCourses = numberOfCourses;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getNumberOfCourses() {
		return numberOfCourses;
	}

	public void setNumberOfCourses(Integer numberOfClasses) {
		this.numberOfCourses = numberOfClasses;
	}
}
