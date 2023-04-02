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
	        
	        int a=n/2;
	        int b=n/2+2;
	        int count=1;
	        
	        System.out.print((n/2+1)+" ");
	        
	        while(count!=n)
	        {
	            if(count%2!=0)
	            {
	                System.out.print(a+" ");
	                a--;
	            }
	            else
	            {
	                System.out.print(b+" ");
	                b++;
	            }
	            count++;
	        }
	        System.out.println();
	    }
	}
}
