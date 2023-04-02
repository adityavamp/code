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
	      int k=sc.nextInt();
	      
	      int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
	      
	      for(int i=0;i<n;i++)
	      {
	          int a=sc.nextInt();
	          
	          min=Math.min(min,a);
	          max=Math.max(max,a);
	      }
	      if(n==1)
	        System.out.println("YES");
	      else
	        System.out.println((max+min)<=k?"YES":"NO");
	    }
	}
}
