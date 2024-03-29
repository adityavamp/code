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
	        
	        int [] dp = new int[n];
	        
	        for(int i=0;i<n;i++)
	          dp[i]=sc.nextInt();
	        
	        Arrays.sort(dp);
	        
	        boolean ans=true;
	        
	        for(int i=0;i<n-1;i++)
	        {
	            if(dp[i+1]-dp[i]>1)
	            {
	                ans=false;
	                break;
	            }
	        }
	        
	        if(ans)
	          System.out.println("YES");
	        else
	          System.out.println("NO");
	    }
	}
}
