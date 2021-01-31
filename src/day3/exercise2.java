package day3;
import java.util.Scanner;
public class exercise2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao phan so thu nhat: ");
		fraction A= inputFraction(sc);
		System.out.print("Nhap vao phan so thu hai: ");
		fraction B= inputFraction(sc);
		System.out.print("Nhap vao phep toan ban muon tinh : ");
		String operator= sc.next();
		fraction C= new fraction(A, B, operator);
		System.out.printf("Vay ket qua cua %s %s %s = %s", A.print(), operator, B.print(), C.print() );
		sc.close();
	}
	public static fraction inputFraction(Scanner sc) {
	
		String Fraction = sc.next();
		String[] fraction = Fraction.split("/");
		int numerator= Integer.parseInt(fraction[0]);
		int denominator= Integer.parseInt(fraction[1]);
		return new fraction(numerator,denominator);
	}
}
