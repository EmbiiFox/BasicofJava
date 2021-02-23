package day5;
public class Course {
	private String courseID;
	private String courseName;
	private double coursePrice;
	
	public Course(String courseID, String courseName, double coursePrice){
			this.setID(courseID);
			this.setName(courseName);
			this.setPrice(coursePrice);
	}
	
	public String getID() {
		return courseID;
	}
	
	public void setID(String ID) {
		this.courseID = ID;
	}
	
	public String getName() {
		return courseName;
	}
	
	public void setName(String name) {
		this.courseName = name;
	}
	
	public double getPrice() {
		return coursePrice;
	}
	
	public void setPrice(double price) {
		this.coursePrice = price;
	}
	
	public void showInfo() {
		System.out.println("Course Info: ");
		System.out.println("- ID \t\t:" + this.getID());
		System.out.println("- Name \t\t:" + this.getName());
		System.out.println("- Price  \t:" + this.getPrice());
	}
}
