package mat335Labs.Lab3;

public class ClassA {

	public ClassA() {
		// TODO Auto-generated constructor stub
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
