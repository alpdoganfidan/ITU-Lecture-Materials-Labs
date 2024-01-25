package mat335Labs.Lab4;

import java.util.Scanner;
public class Lab4_1_b {
    
    public static void main(String arg[])
	{

    double sum=0;
    int count = 0;
	Scanner sc=new Scanner(System.in);

	int n=1;
    while(n>=1)
    {
         System.out.print("Enter a number ");
            n=sc.nextInt();

            if(n>=1) {
                sum+=(double)1/n;
                count ++;
            }

    }
    
    double harmonic;
    if(count>0) {
    	harmonic=count/sum;
    }
    else {
    	harmonic=0;
    }
	System.out.println("Harmonic value = "+harmonic);
        
	
    
}
}