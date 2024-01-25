package mat335Labs.Lab3;

public class Lab3_1 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------True----------------");
		
		System.out.println(hasMidpoint(4,6,8));
		System.out.println(hasMidpoint(8,8,8));
		System.out.println(hasMidpoint(25,-5,10));
		
		System.out.println("----------------False----------------");
		
		System.out.println(hasMidpoint(3,1,3));
		System.out.println(hasMidpoint(21,9,58));
		System.out.println(hasMidpoint(1,2,1));
	}
	
	public static boolean hasMidpoint(int n1, int n2, int n3 ) {
		
		if ( 
				(double)(n1 +n2) / 2 == n3 || 
				(double)(n1 + n3) / 2 == n2 || 
				(double)(n2 + n3) / 2 == n1) 
		{
            return true;
        } 
		
		else {return false;}
		
}
}