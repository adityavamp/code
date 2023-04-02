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
	        int k=sc.nextInt();
	        
	        
	        if(k<2&&n>1)
	          System.out.println(-1);
	          
	        else
	        {
	            for(int i=0;i<k-1;i++)
	              System.out.print((i+1)+" ");
	            for(int i=n;i>=k;i--)
	              System.out.print(i+" ");
	              
	            System.out.println();
	        }
	    }
	}
}
