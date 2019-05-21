package entities;

public class Course {

	private String name;
	private Teacher teacher;
	private Integer numberOfStudents;
	
	public Course() {
	}

	public Course(String name, Teacher teacher, Integer numberOfStudents) {
		this.name = name;
		this.teacher = teacher;
		this.numberOfStudents = numberOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
}
