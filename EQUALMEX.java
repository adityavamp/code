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
	        int [] dp1 = new int[n+1];
	        
	        int[] a= new int[2*n];
	        
	        boolean check=false;
	        
	        for(int i=0;i<2*n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        
	        Arrays.sort(a);
	        
	        for(int i=0;i<2*n;i=i+2)
	        {
	            dp[a[i]]=1;
	        }
	        
	        for(int i=1;i<2*n;i=i+2)
	        {
	            dp1[a[i]]=1;
	        }
	        
	        for(int i=0;i<=n;i++)
	        {
	            if(dp[i]==0&&dp1[i]==0)
	            {
	                check=true;
	                System.out.println("Yes");
	                break;
	            }
	            else if(dp[i]==0||dp1[i]==0)
	             break;
	            
	        }
	        if(!check)
	          System.out.println("NO");
	    }
	}
}
