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
		    int bal=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		    {
		        int a=sc.nextInt();
		        if(bal>=a)
		        {
		            bal-=a;
		            System.out.print(1);
		        }
		        else
		        {
		            System.out.print(0);
		        }
		    }
		    System.out.println();
		}
	}
}
