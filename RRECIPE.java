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
	    sc.nextLine();
	    
	    while(t-->0)
	    {
	        String s=sc.nextLine();
	        
	        long result=0;
	        
	        int i=0,j=s.length()-1;
	        
	        int mod=10000009;
	        
	        boolean check=true;
	        
	        while(i<j)
	        {
	            if(s.charAt(i)=='?'&&s.charAt(j)=='?')
	              result=(Math.max(1,result)*26)%mod;
	            else if(s.charAt(i)!='?'&&s.charAt(j)!='?'&&(s.charAt(i)!=s.charAt(j)))
	            {
	                check=false;
	                break;
	            }
	            i++;
	            j--;
	        }
	        if(s.length()%2!=0)
	          if(s.charAt(i)=='?')
	             result=(Math.max(1,result)*26)%mod;
	             
	        if(!check)
	          System.out.println(0);
	        else 
	          System.out.println(Math.max(1,result));
	        
	    }
	}
}
