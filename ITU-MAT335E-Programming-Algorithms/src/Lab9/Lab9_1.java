package Lab9;

public class Lab9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{3,4,7},
				{0,5,6},
				{4,9,8}};
		
		/*
		int[][] matrix = {
				{4,5,0,1},
				{8,6,3,3},
				{-1,3,6,5},
				{9,-2,-2,0}};
		*/

		int sumMain = sumOfMainDiagonal(matrix);
		int sumMinor = sumOfMinorDiagonal(matrix);
		
		System.out.println("The sum of Main Diagonal Elements of matrix : "+sumMain);
		System.out.println("The sum of Minor Diagonal Elements of matrix : "+sumMinor);
		
		if(sumMain>sumMinor) {
			sumOfRowElements(matrix);
		}
		else if(sumMain<sumMinor) {
			sumOfColElements(matrix);
		}
		else {
			sumOfAllElements(matrix);
		}
		
	}
	public static int sumOfMainDiagonal(int[][] matrix) {
		int sum=0;
		
		for (int i=0; i<matrix.length;i++) {
				sum += matrix[i][i];
		}
		
		return sum;
	}
	
	public static int sumOfMinorDiagonal(int[][] matrix) {
		int sum=0;
	
		for (int i=0; i<matrix.length;i++) {
			System.out.println(matrix[i][matrix.length-i-1]);
				sum += matrix[i][matrix.length-i-1];
		}
		
		return sum;
	}
	
	public static void sumOfRowElements(int[][] matrix) {
		
		
		for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of elements in row " + (i + 1) + ": " + rowSum);
        }

	}

	public static void sumOfColElements(int[][] matrix) {
		
		
		for (int i = 0; i < matrix.length; i++) {
            int colSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colSum += matrix[j][i];
            }
            System.out.println("Sum of elements in column " + (i + 1) + ": " + colSum);
        }

	}

	public static void sumOfAllElements(int[][] matrix) {
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
    }
}
