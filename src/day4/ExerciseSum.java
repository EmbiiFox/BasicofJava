package day4;

public class ExerciseSum {
	public static void main(String[] args) {
		int[] arrInt = {1,2,4,8,0};
		//Tinh tong phan tu trong mang
		int sum=0;
		for(int num:arrInt) {
			sum+=num;
		}
		System.out.println("Tong phan tu la " + sum);
		//Tinh tong so phan tu chan trong mang
		int sumEven=0;
		for(int i=0; i< arrInt.length; i++) {
			if( arrInt[i]%2 !=0) {
				continue;
			}
			sumEven+= arrInt[i];
		}
		System.out.println("Tong phan tu chan la " + sumEven);
		// Tinh tong phan tu le trong mang
		int sumOdd=0;
		for( int i=0; i<arrInt.length; i++) {
			if( arrInt[i]%2 != 0) {
				sumOdd+= arrInt[i];
			}
		}
		System.out.println("Tong phan tu le la " + sumOdd);
	}
}
