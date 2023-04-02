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
	        sc.nextLine();
	        
	        int[][] mat = new int[n+1][n+1];
	        int[][] dp = new int[n+1][n+1];
	        int[][] mat1 = new int[n+1][n+1];
	        
	        for(int i=0;i<n;i++)
	        {
	            String s = sc.nextLine();
	            
	            for(int j=0;j<n;j++)
	            {
	               if(s.charAt(j)=='#')
	                dp[i][j]=1;
	            }
	        }
	        int count=0;

	        for(int i=n-1;i>=0;i--)
	        {
	            for(int j=n-1;j>=0;j--)
	            {
	                mat[i][j]=Math.max(mat[i+1][j],dp[i][j]);
	                mat1[i][j]=Math.max(mat1[i][j+1],dp[i][j]);
	                
	                
	                if(mat[i][j]==0&&mat1[i][j]==0)
	                    count++;
	                
	            }
	        }
	        
	        System.out.println(count);
	        
	    }
	}
}
