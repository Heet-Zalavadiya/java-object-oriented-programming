package student_database_app;

import java.util.Scanner;

public class Student_Database_App {

	public static void main(String[] args) {
		
	   //Ask how many new students we want to add
		System.out.println("Enter number of students to enroll:");
		Scanner in = new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] students = new Student[numOfStudents];
	   
	   //Create n number of new students
		for(int n=0; n < numOfStudents; n++) {
			students[n]= new Student();
			students[n].enroll();
			students[n].payTution();
			
		}
		for(int n=0; n < numOfStudents; n++) {
		     System.out.println(students[n].showInfo());
		}
        
	}

}
