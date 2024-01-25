package mat335Labs.Lab5;

import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter non negative number : ");
		int k = sc.nextInt();
		System.out.print("Please enter a digit : ");
		int d = sc.nextInt();
		
		System.out.printf("The larger position of the digit %d in %d is %d.",d,k,find_digit(k,d));
		
	}
	
	public static int find_digit(int k, int d) {
		
		int foundAt = -1;
		int currentPosition = 0;
		
		if (k == 0 && d == 0) {
			return 0;
		}
		
		while(k>0) {
			
			if ( k%10 == d ) {
				foundAt = currentPosition;
			}
			
			++currentPosition;
			k = k/10;
		}
		
		return foundAt;
	}

}
