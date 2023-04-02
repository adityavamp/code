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
	        
	        int ans=0,count=1,prev=-1;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            if(prev!=-1)
	             {
	                 if(prev!=a)
	                 {
	                     count++;
	                     ans+=count;
	                     count=0;
	                 }
	                 else 
	                   count=1;
	             }
	             prev=a;
	            
	        }
	        
	        System.out.println(ans);
	    }
	}
}
