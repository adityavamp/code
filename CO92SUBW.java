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
	        int cur=0,prev=0,count=0;
	        while(cur<n)
	        {
	            count++;
	            prev=cur;
	            cur+=count;
	        }
	        System.out.println(Math.min(n-prev+count-1,cur-n+count));
	    }
	}
}
