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

	    int n=sc.nextInt(),s=sc.nextInt();
	    int[][] array= new int[s][2];
	    int[][] result = new int[n][2];
	    sc.nextLine();
	    for(int k=0;k<n;k++)
	    {
	        String as1[] = sc.nextLine().split(" ");
            String as2[] = sc.nextLine().split(" ");

            for(int j = 0; j <s; j++) {
                array[j][0] = Integer.parseInt(as1[j]);
                array[j][1] = Integer.parseInt(as2[j]);
            }
	        
	          
	        Arrays.sort(array,(x,y)->Integer.compare(x[0],y[0]));
	        int count=0;
	        for(int i=0;i<s-1;i++)
	        {
	             if(array[i][1]>array[i+1][1])
	                count++;
	            
	        }
	        
	        result[k][0]=count;
	        result[k][1]=k;
	    }
	    
	    Arrays.sort(result,(x,y)->Integer.compare(x[0],y[0]));
	    
	    for(int i=0;i<n;i++)
	      System.out.println(result[i][1]+1);
	   
	    
	}
}