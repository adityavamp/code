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
		
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    long n=sc.nextLong();
		    long m=sc.nextLong();
		    if(n==1||m==1)
		    {
		        if((n==1&&m==2)||(m==1&&n==2))
		         System.out.println("Yes");
		        else
		          System.out.println("No"); 
		    }
		    else if(n%2==0||m%2==0)
		     System.out.println("Yes");
		    else 
		     System.out.println("No");
		}
	}
}
