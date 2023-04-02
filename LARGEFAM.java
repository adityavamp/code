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
		    int n=sc.nextInt();
		    int [] array = new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        
		        array[i]=sc.nextInt();
		    }
		    Arrays.sort(array);
		    int people=n;
		    int count=0;
		    for(int i=0;i<n;i++)
		    {
		        if(people<=array[i])
		          {people-=(n-i);break;}
		        else 
		          {people-=array[i];count++;}
		    }
		    
		    System.out.println(count);
		}
	}
}
