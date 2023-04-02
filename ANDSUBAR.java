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
	        
	        int i=(int)(Math.log(n) / Math.log(2));
	        
	        int val=(int)Math.pow(n,i);
	        
	        if(val==n)
	        {
	            if(n==1)
	              System.out.println(1);
	            else
	            {
	                System.out.println((int)(n-Math.pow(2,i-1)));
	            }
	        }
	        else
	        {
	            System.out.println((int)Math.max(n-Math.pow(2,i)+1,Math.pow(2,i)-Math.pow(2,i-1)));
	        }
	    }
	}
}
