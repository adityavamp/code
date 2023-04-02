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
	    
	    long[] a= new long[1000001];
	    
	    int mod=1000000007;
	    
	    for(int i=1;i<a.length;i++)
	    {
	        a[i]=(a[i-1]+i+(a[i-1]*i))%mod;
	    }
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        System.out.println(a[n]);
	    }
	}
}
