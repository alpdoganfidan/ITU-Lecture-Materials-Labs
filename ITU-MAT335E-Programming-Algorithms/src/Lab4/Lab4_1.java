package mat335Labs.Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> intList = new ArrayList<Integer>();
		
		System.out.println("Please enter positive numbers (Any number less than 1 is a sentinel)...");
		
		int n;
		int counter=0;
		
		do { 
			System.out.printf("%d. Number : ",++counter);
			n = sc.nextInt();
			if(n>0) { intList.add(n);}
		}while(n>0);
		
		
		System.out.println("The loop was stopped due to the sentinel number: " + n);
		System.out.println("Input list : "+intList);
		System.out.println("Harmonic Average : "+HarmonicAverage(intList));
		
	}
	
	public static double HarmonicAverage(List<Integer> intList) {
		
		double HarmonicAverage = 0;
		
		if (intList.size()!=0) {
			
			int numerator = intList.size();
			double denominator = 0;
			
			for (int number : intList) {
				denominator += (double) 1/number;
			}
			
			HarmonicAverage= numerator/denominator;
		
		}
		
		return HarmonicAverage;
		
	}
	
}
