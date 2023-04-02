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
	        long a=sc.nextLong(),b=sc.nextLong(),n=sc.nextLong();
	       

	        long sum=b^a;
	        
	        if(sum==0)
	          System.out.println(0);
	        else
	        {
	           long count=0,c=0,p=n,s=sum;
	           while(sum!=0)
	           {
	               count++;
	               sum=sum>>1;
	           }
	           while(n!=0)
	           {
	               c++;
	               n=n>>1;
	           }
	           if(p<=Math.pow(2,count-1))
	             System.out.println(-1);
	           else if(s<p)
	             System.out.println(1);
	           else
	             System.out.println(2);
	           
	        }
	    }
	}
}
