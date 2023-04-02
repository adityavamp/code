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
	       
	        int [] dp = new int[n+1];
	        
	        long result=0;
	        
	        for(int i=0;i<=n;i++)
	          dp[i]=-1;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            
	            int index=Math.max(0,Math.max(dp[a]+1,i-a+1));
	            
	            result+=Math.max(0,Math.min(n,i+a)-a-index+1);
	            
	            dp[a]=i;
	        }
	        
	        System.out.println(result);
	          
	        
	    }
	}
}
