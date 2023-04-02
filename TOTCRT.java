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
	        
	        Map<String,Integer> m = new HashMap<>();
	        
	        for(int i=0;i<3*n;i++)
	        {
	            String s=sc.next();
	            int a=sc.nextInt();
	            m.put(s,m.getOrDefault(s,0)+a);
	        }
	        List<Integer> l = new ArrayList<>();
	        for(Map.Entry<String,Integer> entry:m.entrySet())
	        {
	            l.add(entry.getValue());
	        }
	        Collections.sort(l);
	        for(int i=0;i<l.size();i++)
	         System.out.print(l.get(i)+" ");
	         
	        System.out.println();
	    }
	}
}
