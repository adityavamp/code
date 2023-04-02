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
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    
		    ArrayList<Integer> l = new ArrayList<>();
		    
		    int start = x - n / 2;
		    
		    int end = x + n / 2;
		    
		    for (int i = start ; i < x ; i++ ) {
		        
		        l.add( i );
		        
		    }
		    
		    for (int i = x + 1 ; i <= end ; i++ ) {
		        
		        l.add( i );
		        
		    }
		    
		    if( (n & 1) == 1  ) l.add( x );
		    
		    System.out.println( l.toString().replace( "," , "" ).replace("[","").replace("]","") );
		    
		    
		}
	}
}
