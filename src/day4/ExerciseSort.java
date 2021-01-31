package day4;
import java.util.Scanner;
public class ExerciseSort {
	public static void main(String[] args) {
		//Nhap 1 mang so nguyen tu ban phim
		//Mang chua duoc sap xep, ban co muon sap xep khong
			//N-Thoat
			//Y- Sap xep theo tang dan hay giam dan(1/0)
		//Mang duoc sap xep theo thu tu tang dan/ giam dan
		int numofArr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        numofArr = sc.nextInt();
        int[] intArr = new int[numofArr];
        System.out.println("Nhập vào các phần tử trong mảng:");
        for (int i = 0; i < numofArr; i++) {
        	intArr[i] = sc.nextInt();
        	System.out.println("a["+i+"] =" + intArr[i]);
        }
        
        for (int i = 0; i <numofArr-1; i++) {
        	for (int j = 0; j <numofArr-1-i; j++) {
                if (intArr[j] >intArr[j + 1]) {
                   swap(intArr[j],intArr[j + 1]);
                }
    	}
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự giảm dần là: ");
        for (i = 0; i < numofArr; i++) {
            System.out.print(intArr[i] + "\t");
        }
        sc.close();
    }
}
	public static void swap(int a, int b) {
			int c;
			c=a;
			a=b;
			c=b;
	}
		
}
