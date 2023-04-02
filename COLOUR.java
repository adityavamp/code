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
	        int count=0;
	        int[] a= new int[3];
	        
	        for(int i=0;i<3;i++)
	        {
	            a[i]=sc.nextInt();
	            
	            if(a[i]>0)
	              count++;
	        }
	        Arrays.sort(a);
	        for(int i=2;i>0;i--)
	        {
	            for(int j=i-1;j>=0;j--)
	            {
	                if(a[j]>1&&a[i]>1)
	                {
	                    a[j]--;
	                    a[i]--;
	                    count++;
	                }
	            }
	        }

	        System.out.println(count);
	    }
	}
}
