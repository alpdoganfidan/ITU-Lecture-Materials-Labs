package mat335Labs.Lab2;

import java.util.Scanner;

public class Lab2_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose a point (x,y) = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The point is = ("+x+","+y+")");
		
		pointSituation(x,y);
		
	}
	
	public static void pointSituation(int pointX, int pointY) {
		
		int centerX = 2;
		int centerY = 4;
		int radius = 6;
		String situation = new String();
		
		System.out.printf("A circle  with a center (%d,%d) and a radius of %d was created...\n",centerX,centerY,radius);
		
		double distancePointAndCenter = Math.sqrt(
				Math.pow((pointX - centerX),2) + Math.pow((pointY - centerY),2)
				);
		
		System.out.printf("The distance between the point and the circle is = %.2f\n",distancePointAndCenter);
		
		if (distancePointAndCenter < radius) {
			situation = "IN";
		}
		else if (distancePointAndCenter == radius) {
			situation = "ON";
		}
		else {
			situation = "OUTSIDE";
		}
		
		System.out.printf("The point is %s the circle\n", situation);
		
	}
}
