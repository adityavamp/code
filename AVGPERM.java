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
	        List<Integer> l = new ArrayList<Integer>();
	        
	        int turn=1;
	        
	        if(n%2==0)
	          turn=-1;
	        int count =n;
	        for(int i=0;i<n/2;i++)
	        {
	            if(turn==-1)
	            {
	                l.add(i,count);
	                l.add(i,count-1);
	                count-=2;
	            }
	            else
	            {
	                l.add(i,count-1);
	                l.add(i,count);
	                count-=2;
	            }
	            turn*=-1;
	        }
	        if(n%2!=0)
	         l.add(n/2,1);
	        
	        for(int i:l)
	          System.out.print(i+" ");
	          
	         System.out.println();
	    }
	}
}
