package entities;

public class Student implements Comparable<Student> {

	private String name;
	
	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}
