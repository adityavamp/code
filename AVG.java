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
	        int k=sc.nextInt();
	        int v=sc.nextInt();
	        int sum=0;
	        for(int i=0;i<n;i++)
	          sum+=sc.nextInt();
	        
	        if(((n+k)*v)>sum&&((n+k)*v-sum)%k==0)
	         System.out.println(((n+k)*v-sum)/k);
	        else
	          System.out.println(-1);
	    }
	}
}
