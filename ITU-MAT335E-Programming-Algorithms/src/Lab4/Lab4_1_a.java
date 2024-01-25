package mat335Labs.Lab4;

import java.util.Scanner;

public class Lab4_1_a {
		
	    public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			
			double harmonicAverage = 0;
			
			System.out.println("Choose n :");
			int n=sc.nextInt();
			
			double i;
		    double sum=0;
		    
			for( i=1;i<=n;i++)
			{
				
		        System.out.println("Enter a positive value : ");
		        double k=sc.nextDouble();
				sum += 1/k;
			}
			
			if (n>0) {
				harmonicAverage=n/sum;
			}
			
			System.out.println("Harmonic value = "+harmonicAverage);
	}

}


    

    
