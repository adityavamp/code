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
	        
	        int[] a = new int[n];
	        int[] b = new int[n];
	        
	        for(int i=0;i<n;i++)
	          a[i]=sc.nextInt();
	        for(int i=0;i<n;i++)
	          b[i]=sc.nextInt();
	          
	        Arrays.sort(a);
	        Arrays.sort(b);
	        
	        int max=Integer.MIN_VALUE;
	        
	        for(int i=0;i<n;i++)
	        {
	            max=Math.max(a[i]+b[n-i-1],max);
	        }
	        System.out.println(max);
	    }
	}
}
