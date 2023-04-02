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
	        int[][] tax= new int[][]{{0,250000,0},{250001,500000,5},{500001,750000,10},{750001,1000000,15},{1000001,1250000,20},{1250001,1500000,25},{1500001,Integer.MAX_VALUE,30}};
	        
	         int n=sc.nextInt();
	         int amount=n;
	         
	         for(int i=1;i<7;i++)
	         {
	             if(n>=tax[i][0])
	             {
	                 amount=amount-((Math.min(n,tax[i][1])-tax[i-1][1])*(tax[i][2]))/100;
	             }
	             else
	               break;
	               
	            
	         }
	         
	         System.out.println(amount);
	        
	    }
	}
}
