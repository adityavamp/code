/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        
	        System.out.print(1+" "+1+" ");
	        
	        long val=2,sum=2;
	        
	        for(int i=1;i<n;i++)
	        {
	            val*=2;
	            
	            System.out.print((val-sum)+" ");
	            
	            sum=val;
	        }
	        
	        System.out.println();
	    }
	}
}
