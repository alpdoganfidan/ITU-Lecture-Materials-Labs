package mat335Labs.Lab2;

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the 1st point (x1,y1) = ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("(x1,y1) is = ("+x1+","+y1+")");
		
		System.out.println("Choose the 2nd point (x2,y2) = ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("(x2,y2) is = ("+x2+","+y2+")");
		
		double distanceManhattan = Math.abs(x1-x2) + Math.abs(y1-y2);
		System.out.println("The Manhathan distance between two points (x1,y1) and (x2,y2) is = " + distanceManhattan);
	}

}
