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
	        int a=sc.nextInt();
	        int a1=sc.nextInt();
	        int b=sc.nextInt();
	        int b1=sc.nextInt();
	        
	        if(a==b&&a1==b1)
	          System.out.println(0);
	        else if((a1+a)%2==(b+b1)%2)
	          System.out.println(2);
	        else
	          System.out.println(1);
	        
	         
	    }
	}
}
