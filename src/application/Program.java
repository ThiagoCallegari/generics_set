package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Student> collection = new TreeSet<Student>();
		
		try {
			System.out.print("Enter teacher's name: ");
			String teacherName = sc.nextLine();
			System.out.print("Enter the number of courses: ");
			int numberOfCourses = sc.nextInt();
			System.out.println();
			System.out.println("Enter the name of course:");
			Teacher teacher = new Teacher(teacherName, numberOfCourses);
			sc.nextLine();
			
			for (int i=1; i <= numberOfCourses; i++) {
				System.out.print("#" + i + " Course: ");
				String courseName = sc.nextLine();
				System.out.println();
				System.out.print("How many students for course " + courseName + "? ");
				int numberOfStudents = sc.nextInt();
				Course course = new Course(courseName, teacher, numberOfStudents); 
				sc.nextLine();
				
				for (int j=1; j <= numberOfStudents; j++) {
					String studentName = sc.nextLine();
					Student student = new Student(studentName);
					collection.add(student);
				}
				System.out.println();
			}
			
			System.out.println("Total Students: " + collection.size());
			System.out.println();
			
			System.out.println("List of students:");
			for (Student stu : collection) {
				System.out.println(stu.getName());
			}
		}
		catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
