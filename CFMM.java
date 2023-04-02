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
	        Map<Character,Integer> m = new HashMap<>();
	        sc.nextLine();
	        m.put('c',0);
	        m.put('d',0);
	        m.put('o',0);
	        m.put('f',0);
	        m.put('e',0);
	        m.put('h',0);
	        char[] ti = new char[]{'c','d','o','f','e','h'};
	        
	        for(int i=0;i<n;i++)
	        {
	            String s=sc.nextLine();
	            
	            for(int j=0;j<s.length();j++)
	            {
	                if(m.containsKey(s.charAt(j)))
	                 m.put(s.charAt(j),m.get(s.charAt(j))+1);
	            }
	        }
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<ti.length;i++)
	        {
	            if(ti[i]=='c'||ti[i]=='e')
	            {
	                min=Math.min(m.get(ti[i])/2,min);
	            }
	            else
	              min=Math.min(m.get(ti[i]),min);
	        }
	        
	        System.out.println(min);
	    }
	}
}
