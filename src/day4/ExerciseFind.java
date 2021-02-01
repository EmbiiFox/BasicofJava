package day4;

public class ExerciseFind {
	public static void main(String[] args) {
	//Tim gia tri trùng
	// In 2 array ra
	//cho biet vi trí trùng, hàng nào, cột nào
	int [][] arrMultiOne= {{1,37,3},{2,21,6},{12,8,9}};
	int [][] arrMultiTwo= {{13,7,3},{21,12,4},{3,2,7}};
	printMatrix(arrMultiOne,3,3);
	printMatrix(arrMultiTwo,3,3);
	int row = 3;
	int col=3;
	for (int i = 0; i < row; i++) {
    	for (int j = 0; j < col; j++) {
			if(arrMultiOne[i][j] == arrMultiTwo[i][j]){
				System.out.println("Phần tử trùng ở hàng "+ i + " cột "+ j);
			}
    	}
	}
}

	public static void printMatrix(int a[][] ,int row ,int col){
	for (int i = 0; i < row; i++) {
    	for (int j = 0; j < col; j++) {
        	System.out.print(a[i][j] + "\t");
    	}
    	System.out.println("\n");   
	}
}
}
