/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prefix_Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        
	        if(n%2!=0)
	          System.out.println(-1);
	        else
	        {
	            for(int i=2;i<=n;i=i+2)
	              System.out.print((i)+" "+(i-1)+" ");
	              
	            System.out.println();
	        }
	    }
	}
}