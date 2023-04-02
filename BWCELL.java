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
	        int left=0;
	        int right=0;
	        boolean check=false;
	        String s =sc.nextLine();
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='W')
	              check=true;
	            else
	            {
	                if(check)
	                  right++;
	                else
	                  left++;
	            }
	        }

	       if(left!=right)
	         System.out.println("Aleksa");
	       else
	         System.out.println("Chef");
	        
	       
	    }
	    
	}
}
