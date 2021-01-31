package day3;

import java.util.Scanner;

public class Main {
	private static Course CourseObj	= null;
	
	public static void main(String[] args) {
		Scanner sc 		= new Scanner(System.in);
		int functionID	= 0;
		boolean flag	= true;
		
		do{
			showMenu();
			functionID		= sc.nextInt();
			sc.nextLine();
			
			switch (functionID) {
				case 1: addCourse(); break;
				case 2: editCourse(); break;
				case 3: infoCourse(); break;
				case 4:
				default:
					flag = false;
					break;
			}
		} while(flag == true);
		
		sc.close();
	}
	
	private static void infoCourse() {
		// TODO Auto-generated method stub
		
	}

	private static void addCourse() {
		// TODO Auto-generated method stub
		
	}

	public static void showMenu(){
		myPrint("===================== COURSE MANAGER =====================");
		myPrint("1. Add course");
		myPrint("2. Edit course");
		myPrint("3. Info course");
		myPrint("4. Exit");
		myPrint("Your choise [1-4]: ");
	}
	
	public static void myPrint(String content){
		System.out.println(content);
	}
	
	public static void addBook(){
		Scanner sc			= new Scanner(System.in);
		String courseName		= "";
		String courseID		= "";
		double coursePrice	= 0;
		
		myPrint("ID: ");
		courseID	= sc.nextLine();
		
		myPrint("Name: ");
		courseName	= sc.nextLine();
		
		myPrint("Price: ");
		coursePrice	= sc.nextDouble();
		
		CourseObj	= new Course(courseID, courseName, coursePrice);
		sc.close();
		
	}
	
	public static void editCourse(){
		if(CourseObj != null) {
			Scanner sc			= new Scanner(System.in);
			String courseName		= "";
			double coursePrice	= 0;
			
			myPrint("Name: ");
			courseName	= sc.nextLine();
			
			myPrint("Price: ");
			coursePrice	= sc.nextDouble();
			
			CourseObj.setName(courseName);
			CourseObj.setPrice(coursePrice);
			sc.close();
		}else{
			myPrint("Course is not exist!");
		}
	}
	
	public static void infoBook(){
		if(CourseObj != null) {
			CourseObj.showInfo();
		}else{
			myPrint("Course is not exist!");
		}
	}

}

