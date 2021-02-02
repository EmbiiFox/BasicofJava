package day4;
import java.util.Arrays;
import java.util.Scanner;
public class ExerciseSort {
	public static void main(String[] args) {
		//Nhap 1 mang so nguyen tu ban phim
		//Mang chua duoc sap xep, ban co muon sap xep khong
			//N-Thoat
			//Y- Sap xep theo tang dan hay giam dan(1/0)
		//Mang duoc sap xep theo thu tu tang dan/ giam dan
		int numofArr, temp;
		String type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng:");
		numofArr =sc.nextInt();
		int[] intArr = new int[numofArr];
		System.out.println("Nhập vào các phần tử trong mảng:");
		for (int i = 0; i < numofArr; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			intArr[i] = sc.nextInt();
		}
		System.out.println("Input: "+ Arrays.toString(intArr));
		
		
		if (!sorted(intArr)) {
			System.out.println("Mang chua duoc sap xep, ban co muon sap xep khong? (Y/N)");
            type = sc.next();
            if ("Y".equals(type)) {
                System.out.print("Chon 1 de sap xep theo thu tu tang dan.");
                System.out.print("Chon 0 de sap xep theo thu tu giam dan.");
                type = sc.next();
                if ("1".equals(type)) {
                    Arrays.sort(intArr);
                    System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là:" + Arrays.toString(intArr));
                } else if ("0".equals(type)) {
                    for (int i = 0; i < intArr.length / 2; i++) {
                        temp = intArr[i];
                        intArr[i] = intArr[intArr.length - 1 - i];
                        intArr[intArr.length - 1 - i] = temp;
                    }
                    System.out.println("Kết quả sau khi sắp xếp theo thứ tự giam dần là:" + Arrays.toString(intArr));
                }
            } 
            else if ("N".equals(type)) {
            }
            sc.close();
        } 
		else {
            System.out.println("Mang da duoc sap xep");
	        }
	    }

	    public static boolean sorted(int intArr[]) {
	        for (int i = 0; i < intArr.length - 1; i++) {
	            if (check(intArr)) {
	                if (intArr[i] < intArr[i + 1]) {
	                    return false;
	                }
	            } else {
	                if (intArr[i] > intArr[i + 1]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static boolean check(int intArr[]) {
	        int i = 0;
	        for (; i < intArr.length; i++) {
	            if (intArr[i] != intArr[i + 1]) {
	                break;
	            }
	        }
	        return intArr[i] > intArr[i + 1];
	    }
	}