package day4;

public class ExerciseCheckSum {
	public static void main(String[] args) {
		int[] arrInt = {1,8,3,2,0};
		int number   = 5;
		//Neu mang co tong 2 phan tu lien tiep bang number thi in ra success
		for(int i=0; i< arrInt.length;i++) {
			if ( (arrInt[i]+ arrInt[i+1])==number) {
				System.out.println("Success");
				break;
			}
		}
	}
}