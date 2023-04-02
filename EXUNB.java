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
	       
	       
	       int sum=(n-1)*(n)/2;
	       
	       if(sum%n==0)
	       {
	           System.out.println("YES");
	           int div=sum/n;
	           for(int i=0;i<n;i++)
	           {
	               int[] a= new int[n];
	               int count=0,j=i;
	               while(count<div)
	               {
	                   a[(j+1)%n]=1;
	                   count++;
	                   j++;
	               }
	               
	               for(j=0;j<n;j++)
	                 System.out.print(a[j]);
	                 
	                System.out.println();
	           }
	       
	       }
	       else
	         System.out.println("NO");
	       
	    }
	}
}