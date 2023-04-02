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
	        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();
	        
	        int min=Integer.MAX_VALUE;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            int p=sc.nextInt();
	            
	            
	            if(a>k)
	            {
	                a=Math.max(a-m,k);
	            }
	            else
	            {
	                a=Math.min(m+a,k);
	            }
	            
	            if(l<=a&&a<=r)
	              min=Math.min(min,p);
	        }
	        
	        System.out.println((min==Integer.MAX_VALUE)?-1:min);
	    }
	}
}
