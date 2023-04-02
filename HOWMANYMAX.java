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
	        sc.nextLine();
	        int[] dp = new int[n];
	        
	        String s = sc.nextLine();
	        
	        
	        
	        
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='0')
	              dp[i+1]=dp[i]+1;
	        }

	        for(int i=s.length();i>=1;i--)
	        {
	            if(s.charAt(i-1)=='1')
	              dp[i-1]+=dp[i]+1;
	        }
	        int count=0;
	        for(int i=1;i<dp.length-1;i++)
	        {
	            if(dp[i]>dp[i-1]&&dp[i]>dp[i+1])
	              count++;
	        }
	        
	        if(n!=1&&dp[0]>dp[1])
	          count++;
	        if(n!=1&&dp[dp.length-1]>dp[dp.length-2])
	          count++;
	          
	          
	         System.out.println((n==1)?1:count);
	    }
	}
}
