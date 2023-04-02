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
	        long even=0,odd=0;
	        int max=Integer.MIN_VALUE;
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            int a=Math.abs(sc.nextInt());
	            if(i%2==0)
	            {
	                even+=a;
	                min=Math.min(a,min);
	            }
	            else
	            {
	                odd-=a;
	                max=Math.max(a,max);
	            }
	        }
	        
	        long sum=even+odd;
	        
	        System.out.println(Math.max(sum,sum+2*max-2*min));
	    }
	}
}
