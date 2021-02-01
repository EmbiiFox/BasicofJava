package day4;
import java.util.Scanner;
public class ExerciseSplitArray {
	public static void main (String[] args) {
		int numOfArray, numOfEvenArr, numOfOddArr;
	    Scanner sc = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhập vào số phần tử của mảng: ");
	        numOfArray = sc.nextInt();
	    } while (numOfArray <= 0);
	         
	    int intArr[] = new int[numOfArray];
	    int evenArr[] = new int[numOfArray]; 
	    int oddArr[] = new int[numOfArray]; 
	         
	    System.out.println("Nhập các phần tử cho mảng: ");
	    for (int i = 0; i < numOfArray; i++) {
	        System.out.print("Nhập phần tử thứ " + i + ": ");
	        intArr[i] = sc.nextInt();
	    }
	    numOfEvenArr = numOfOddArr =0;
	         
	    for (int i = 0; i < numOfArray; i++) {
	        if (intArr[i] % 2 == 0) {
	            evenArr[numOfEvenArr] = intArr[i];
	            numOfEvenArr++;
	        } 
	        else {
	            oddArr[numOfOddArr] = intArr[i];
	            numOfOddArr++;
	        }
	    }
	         
	    System.out.println("Các phần tử của mảng chan là: ");
	    for (int i = 0; i < numOfEvenArr; i++) {
	        System.out.print(evenArr[i] + "\t");
	    }
	         
	    System.out.println(" \n Các phần tử của mảng le là: ");
	    for (int i = 0; i < numOfOddArr; i++) {
	        System.out.print(oddArr[i] + "\t");
	    }
	    sc.close();
	}
}
