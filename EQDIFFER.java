/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int t = Integer.parseInt(st.nextToken());
	    
	    while(t-->0)
	    {
	        Map<Long,Integer> m = new HashMap<>();

	        int n= Integer.parseInt(br.readLine());
	        int max=0;
	       // System.out.println(n);
	        st= new StringTokenizer(br.readLine());
	        for(int i=0;i<n;i++)
	        {
	            Long a  = Long.parseLong(st.nextToken());
	            m.put(a,m.getOrDefault(a,0)+1);
	            max=Math.max(max,m.get(a));

	        }
	        
	        if(max>1)
	          System.out.println(n-max);
	        else
	        {
	            if(max==1&&n>1)
	             System.out.println(n-2);
	            else
	             System.out.println(0);
	        }
	    }
	    
	    
	}
}
