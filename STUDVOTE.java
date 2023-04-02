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
	        int n =sc.nextInt();
	        int k=sc.nextInt();
	        int[] dp = new int[n];
	        
	        int count=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            
	            if(a-1==i)
	            {
	                if(dp[i]>=k)
	                 count--;
	                
	                dp[i]=-1;
	            }
	            else
	            {
	                if(dp[a-1]!=-1)
	                {
	                    dp[a-1]++;
	                    if(dp[a-1]==k)
	                      count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }
	}
}
