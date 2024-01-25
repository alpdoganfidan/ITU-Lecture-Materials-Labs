package mat335Labs.Lab3;

import java.util.Scanner;

public class Lab4_1_Yeniden {
	
	    public static void main(String arg[]){
	    	
			double n,i;
		    double k=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			n=sc.nextDouble();
			for( i=1;i<=n;i++)
			{
		        while(k<=0)
		        {
		            System.out.println("Enter value"+i++);
		            k=sc.nextDouble();
		        }
				k=k+(1/k);
		}
		System.out.println("Harmonic value = "+k);
		}

	}