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
		    int n =sc.nextInt();
		    int k=sc.nextInt();
		    long[] a = new long[n];
		    long[] b= new long[n];
		    long sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextLong();
		    }
		    for(int i=0;i<n;i++)
		    {
		        b[i]=sc.nextLong();
		        sum+=a[i]*b[i];
		    }
		    long max=sum;
		    for(int i=0;i<n;i++)
		    {
		        max=Math.max(max,Math.max(((sum-a[i]*b[i])+(a[i]-k)*b[i]),((sum-a[i]*b[i])+(a[i]+k)*b[i])));  
		    }
		    
		    System.out.println(max);
		}
	}
}
