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
	        int sum=0;
	        
	        int[] a= new int[n];
	        int[] b= new int[n];
	        
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	            sum=Math.max(sum,a[i]);
	        }
	        
	        for(int i=0;i<n;i++)
	          b[i]=sc.nextInt();
	          
	        int[][] dp = new int[n+1][sum+sum+1];
	        
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=0;j<(2*sum+1);j++)
	            {
	                dp[i][j]=dp[i-1][j];
	                
	                if(j>=b[i-1])
	                {
	                    if(dp[i][j-b[i-1]]!=0||b[i-1]==j)
	                    {
	                       if(dp[i][j]==0)
	                        dp[i][j]=dp[i][j-b[i-1]]+1;
	                       else
	                         dp[i][j]=Math.min(dp[i][j],dp[i][j-b[i-1]]+1);
	                    }
	                }
	            }
	        }
	        long result=0;
	        for(int i=0;i<n;i++)
	        {
	            result+=dp[n][2*a[i]];
	        }
	        
	        System.out.println(result);
	    }
	}
}
