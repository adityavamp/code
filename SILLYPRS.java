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
	        
	        long sum=0,odd1=0,even1=0,odd2=0,even2=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            sum+=a;
	            
	            if(a%2!=0)
	              odd1++;
	            else 
	              even1++;
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            
	            sum+=a;
	            
	            if(a%2!=0)
	             odd2++;
	            else
	             even2++;
	        }
	        
	        long p=n-(Math.min(even1,even2)+Math.min(odd1,odd2));
	        
	        sum-=p;
	        
	        System.out.println(sum/2);
	    }
	}
}
