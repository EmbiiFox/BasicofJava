package day5;
public class Store {
	private static int totalItems		= 0;		
	private final int MAX_ITEMS			= 10;		
	private Course[] listItems			= null;
	
	public Store(){
		listItems	= new Course[MAX_ITEMS];
	}
	
	public int getItemPosition(String courseID){
		for(int i = 0; i < totalItems; i++){
			if(courseID.equals(listItems[i].getID())==true) return i;
		}
		return -1;
	}
	
	// checkFull
	public boolean checkFull(){
		if(totalItems == MAX_ITEMS) return true;
		return false;
	}
	
	// checkEmpty
	public boolean checkEmpty(){
		if(totalItems == 0) return true;
		return false;
	}
	
	// Add course
	public void add(Course courseObj) {
		// TODO Auto-generated method stub
		if(this.checkFull() == false){
			this.listItems[totalItems]	= courseObj;
			Store.totalItems++;
			System.out.println("Add successfull!");
		}else{
			System.out.println("Store is full!");
		}
	}
	
	// Edit course
	public void edit(String courseID, String courseName, double coursePrice){
		int coursePosition	= this.getItemPosition(courseID);
		if(coursePosition == -1){
			System.out.println("This book is not exist!");
		}else{
			listItems[coursePosition].setName(courseName);
			listItems[coursePosition].setPrice(coursePrice);
			System.out.println("Edit successfull!");
		}
	}
	
	// Delete course
	public void delete(String courseID){
		int coursePosition	= this.getItemPosition(courseID);
		if(coursePosition == -1){
			System.out.println("This course is not exist!");
		}else{
			for(int i = coursePosition; i < totalItems - 1; i++){
				listItems[i] = listItems[i+1];
			}
			Store.totalItems--;
			System.out.println("Delete successfull!");
		}
	}
	
	// Find course
	public void find(String courseID){
		int coursePosition	= this.getItemPosition(courseID);
		if(coursePosition == -1){
			System.out.println("This course is not exist!");
		}else{
			listItems[coursePosition].showInfo();
		}
	}
	
	// List course
	public void list(){
		if(this.checkEmpty() == false){
			for(int i = 0; i < totalItems; i++){
				this.listItems[i].showInfo();
			}
		}else{
			System.out.println("Store is empty!");
		}
	}
}
