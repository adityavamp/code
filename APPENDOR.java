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
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int prev=0;
	        
	        for(int i=0;i<a;i++)
	        {
	           prev=prev|sc.nextInt();
	        }
	        StringBuilder result = new StringBuilder();
	        boolean check=true;
	        
	        if(b==0&&prev==0)
	          result.append(0);
	        else if((b==0&&prev>0)||(prev>b))
	          check=false;
	        while(b!=0)
	        {
	            if((b&1)==0&&(prev&1)==1)
	            {
	                check=false;
	                break;
	            }
	            else if((b&1)==1&&(prev&1)==0)
	              result.append(1);
	            else
	              result.append(0);
	              
	            b=b>>1;
	            prev=prev>>1;
	              
	        }
	        System.out.println((check)?Integer.parseInt(result.reverse().toString(),2):-1);
	    }
	}
}
