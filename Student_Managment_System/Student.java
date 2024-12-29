package Student_Managment_System;

public class Student {
	
	private int id;
	private String name;
	private String grade;
	
	//Constructor
	public Student(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	//Getter methods
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	//Display student details
	public String toString() {
		return "Id: " + id +", Name: " + name +", Grade: " + grade;
	}
}
