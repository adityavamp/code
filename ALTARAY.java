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
	        int[] array=new int[n];
	        
	        for(int i=0;i<n;i++)
	          array[i]=sc.nextInt();
	          
	        int[] dp = new int[n];
	          
	        dp[n-1]=1;
	         
	        for(int i=n-1;i>=1;i--)
	        {
	            if((array[i-1]<0&&array[i]>0)||(array[i-1]>0&&array[i]<0))
	              dp[i-1]=dp[i]+1;
	            else
	              dp[i-1]=1;
	        }
	        
	        for(int i:dp)
	          System.out.print(i+" ");
	         
	        System.out.println();
	    }
	}
}
