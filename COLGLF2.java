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
	        int s=sc.nextInt();
	        
	        int[] d= new int[s];
	        
	        for(int i=0;i<s;i++)
	          d[i]=sc.nextInt();
	          
	        long time=0;
	        
	        for(int j=0;j<s;j++){
	         int n=sc.nextInt();
	         for(int i=0;i<n;i++)
	           time+=sc.nextInt()-d[j];
	           
	         time+=d[j];
	        }
	        System.out.println(time);
	    }
	}
}
