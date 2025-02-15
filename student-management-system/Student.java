package student_database_app;

import java.util.Scanner;

public class Student {
	
		private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentID;
		private String courses;
		private int tutionBalance;
		private static int costOfCourse = 600;
		private static int id = 1000;
		
		//Constructor:prompt user to enter student name and year
		public Student() {
			Scanner in = new Scanner(System.in);
	        System.out.println("Enter student first name: ");
	        this.firstName = in.nextLine();
	        
	        System.out.println("Enter student last name: ");
	        this.lastName = in.nextLine();
	        
	        System.out.println("1 - Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level");
	        this.gradeYear = in.nextInt();
	        
	        setStudentID();
	  
	        	        	        
		}
		//Generate an ID
		private void setStudentID() {
			//Grade Level + ID
			 id++;
			this.studentID =  gradeYear + "" + id;
			
		}
		
		//Enroll in courses
		public void enroll() {
			//Get inside a loop, user hits 0
			do {
				System.out.print("Enter course to enroll(Q to quit):");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q") ) {
					courses = courses + "\n " + course;
					tutionBalance = tutionBalance + costOfCourse;
				}
				else {
					break;
				}
			}while(1!=0);
			
		}
		//View balance
		public void viewBalance() {
			System.out.println("Your balance is : Rs" + tutionBalance);
		}
		//Pay Tuition
		public void payTution() {
			viewBalance();
			System.out.print("Enter your payment: Rs");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tutionBalance = tutionBalance-payment;
			System.out.println("Thank you for your payment of Rs" + payment);
			viewBalance();
		}
		//Show Status
		public String showInfo() {
			return "Name:"+firstName+" "+lastName+"\nGrade Level:"+gradeYear+"\nStudent ID:"+studentID+"\nCourses Enrolled:"+courses+"\nBalance: Rs"+tutionBalance;
		}

}


