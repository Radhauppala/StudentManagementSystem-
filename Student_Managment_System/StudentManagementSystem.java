package Student_Managment_System;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nStudent Management System");
			System.out.println("1.Add Student");
			System.out.println("2.View All Students");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Enter Student Name: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter Student Grade: ");
				String grade = scanner.nextLine();
				
				students.add(new Student(id, name, grade));
				
				System.out.println("Student added successfully!");
				break;
				
			case 2:
				if(students.isEmpty()) {
					System.out.println("No students are added list is empty.");
				}
				else {
					System.out.println("\nList of Students: ");
					for(Student student : students) {
						System.out.println(student);
					}
				}
				break;
			
			case 3:
				System.out.println("Exiting... Thank you!");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
