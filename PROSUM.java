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
	        
	        long two=0,y=n;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            if(a==1||a==0)
	            {
	                y--;
	            }
	            if(a==2)
	              two++;
	        }
	        System.out.println(((y-1)*y/2)-((two-1)*(two)/2));
	         
	    }
	}
}