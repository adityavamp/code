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
	        sc.nextLine();
	        
	        String s1=sc.nextLine();
	        String s2=sc.nextLine();
	        
	        int z1=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            if(s2.charAt(i)=='1')
	              z1++;
	        }
	        

	         if((z1==0||z1==n)&&!s1.equals(s2))
	          System.out.println("NO");
	        else
	          System.out.println("YES");
	    }
	}
}
