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
	        boolean invalid=false,weak=false;
	        
	        for(int i=0;i<n;i++)
	        {
	            String c=sc.next();
	            int s=0;
	            if(c.equals("correct"))
	             s=1;
	             
	            String a=sc.next();
	            
	            int count=0;
	            for(int j=0;j<k;j++)
	            {
	                
	                if(a.charAt(j)=='1')
	                  count++;
	                else 
	                  count--;
	            }
	            
	            if(s==1&&count!=k)
	              invalid=true;
	            else if(s==0&&count==k)
	              weak=true;
	        }
	        
	        if(invalid)
	          System.out.println("INVALID");
	        else if(weak)
	          System.out.println("WEAK");
	        else
	          System.out.println("FINE");
	    }
	}
}
