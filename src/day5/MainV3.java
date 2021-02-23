package day5;
import java.util.Scanner;
public class MainV3 {
	private static Store storeObj	= new Store();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int functionID	= 0;
		boolean flag	= true;
		
		do {
			showMenu();
			
			try {
				functionID		= sc.nextInt();
				sc.nextLine();
				
				switch (functionID) {
					case 1: addCourse(); 		break;
					case 2: editCourse(); 		break;
					case 3: deleteCourse(); 	break;
					case 4: findCourse(); 		break;
					case 5: listCourse(); 		break;
					case 6: 
					default:
						flag = false;
						break;
				}
			} catch (Exception e) {
				myPrint("Error! Please try again!");
				flag	= true;
				sc.nextLine();
			}
			
		} while (flag == true);
		
		sc.close();
	}

	public static void showMenu(){
		myPrint("----------- COURSE MANAGER ----------- ");
		myPrint("1. Add Course");
		myPrint("2. Edit Course");
		myPrint("3. Delete Course");	
		myPrint("4. Find Course");
		myPrint("5. List Course");
		myPrint("6. Exit");
		myPrint("Your choise [1-6]: ");
	}
	
	public static void addCourse(){
		if(storeObj.checkFull() == false){
			Scanner sc = new Scanner(System.in);
			String courseName	= "";
			String courseID		= "";
			double coursePrice  = 0;
			
			myPrint("ID: ");
			courseID		= sc.nextLine();
			
			myPrint("Name: ");
			courseName	= sc.nextLine();
			
			myPrint("Price: ");
			coursePrice	= sc.nextDouble();
			
			Course courseObj	= new Course(courseID, courseName, coursePrice);
			storeObj.add(courseObj);
		}else{
			System.out.println("Store is full!");
		}
	}
	
	public static void myPrint(String content){
		System.out.println(content);
	}
	
	public static void deleteCourse(){
		Scanner sc = new Scanner(System.in);
		
		String courseID	= "";
		
		myPrint("ID: ");
		courseID		= sc.nextLine();
		
		storeObj.delete(courseID);
	}
	
	public static void findCourse(){
		Scanner sc = new Scanner(System.in);
		
		String courseID	= "";
		
		myPrint("ID: ");
		courseID		= sc.nextLine();
		
		storeObj.find(courseID);
	}
	
	public static void editCourse(){
		Scanner sc = new Scanner(System.in);
		
		String courseName	= "";
		String courseID	= "";
		double coursePrice= 0;
		
		myPrint("ID: ");
		courseID		= sc.nextLine();
		
		myPrint("Name: ");
		courseName	= sc.nextLine();
		
		myPrint("Price: ");
		coursePrice	= sc.nextDouble();
		
		storeObj.edit(courseID, courseName, coursePrice);
	}
	
	public static void listCourse(){
		storeObj.list();
	}
}
