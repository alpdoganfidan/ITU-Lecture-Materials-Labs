package mat335Labs.Lab2;

import java.util.Scanner;

public class Lab2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a number : ");
			int number = sc.nextInt();
			
			if ((number-1)%4 == 0 && (number-1)/4 >=0) {
				System.out.println("It is an Hilbert Number");
			}
			else {
				System.out.println("It is NOT a Hilbert Number");
			}
		}
	}
}

