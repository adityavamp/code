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
	        int h=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
	        int count=0;
	        
	       if(y>x)
	       {
	           h-=y;
	           count=1;
	       }
	        if(h<=0)
	          System.out.println(1);
	        else
	        {
	            if(h%x==0)
	              System.out.println(count+h/x);
	            else
	              System.out.println(count+h/x+1);
	        }
	    }
	}
}
