/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while( n-- > 0 ){
		    long i = sc.nextLong();
		    long j = sc.nextLong();
		    
		    long count = 0;
		    
		    while( i != j ){
		        if( i > j ){
		            i /= 2;
		        }
		        else{
		            j /= 2;
		        }
		        count++;
		    }
	
		    
		    System.out.println( count );
		    
		}
	}
}
