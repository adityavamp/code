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
	        int max=Integer.MIN_VALUE;
	        long sum=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            sum+=a;
	            max=Math.max(max,a);
	        }
	        double d=(double)(sum-max)/(n-1)+max;
	        System.out.println(String.format("%.6f", d));
	    }
	}
}
