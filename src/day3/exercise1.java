package day3;
import java.util.Scanner;
public class exercise1 {
	public static void main(String[] args) {
		fraction A = Input();
		if( A.checkNormalize()) {
			System.out.println("Phan so ban nhap "+ A.print()+" la mot phan so toi gian.");
		}
		else {
			System.out.println("Phan so ban nhap "+ A.print()+" la phan so chua toi gian." );
			A.normalize();
			System.out.println("Phan so toi gian la "+ A.print() );
		}
		
	
	}
	public static fraction Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tu so: ");
		int numerator = sc.nextInt();
		System.out.println("Nhap vao mau so: ");
		int denominator = sc.nextInt();
		sc.close();
		fraction A=  new fraction(numerator, denominator);
		return A;
	}
}
