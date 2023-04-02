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
	        
	        String[] s= new String[n];
	        
	        sc.nextLine();
	        
	        for(int i=0;i<n;i++)
	          s[i]=sc.nextLine();
	        
	        int ans=0;
	        
	        for(int i=0;i<10;i++)
	        {
	            int count=0;
	            for(int j=0;j<n;j++)
	              if(s[j].charAt(i)=='1')
	                count++;
	                
	            if(count%2!=0)
	              ans++;
	        }
	        
	        System.out.println(ans);
	    }
	}
}
