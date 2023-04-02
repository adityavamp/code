/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long mod = (long)Math.pow( 10 , 9 ) + 7;
    
    static long pow( long a , long b ){
        
        long ans = 1;
        
        while( b > 0 ){
            
            if( (b & 1) == 1 ){
                
                ans = (ans * (a % mod) ) % mod;
                
            }
            
            a = ((a % mod) * (a % mod)) % mod;
            b = b >> 1;
            
        }
        
        return ans;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while( t-- > 0 ){
		    
		    int n = sc.nextInt();    
		    
		    long total = pow( 2 , n - 1 ) ;
		    
		    total %= mod;
		    
		    System.out.println( total );
		    
		}
	}
}
