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
	        long x=sc.nextLong(),b=sc.nextLong();
	        
	        long w=(long)Math.ceil((Math.log(x)/Math.log(2)))+1;
	        
	        
	        if(w>b)
	          System.out.println(0);
	        else 
	          System.out.println(b-w+1);
	    }
	}
}
