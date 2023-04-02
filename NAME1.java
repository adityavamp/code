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
	        String x1=sc.next();
	        String x2=sc.next();
	        
	        int n=sc.nextInt();
	        
	        Map<Character,Integer> m = new HashMap<>();
	        
	        for(int i=0;i<x1.length();i++)
	          m.put(x1.charAt(i),m.getOrDefault(x1.charAt(i),0)+1);
	        for(int i=0;i<x2.length();i++)
	          m.put(x2.charAt(i),m.getOrDefault(x2.charAt(i),0)+1);
	         
	         
	          
	         String [] s = new String[n];
	         sc.nextLine();
	         int length=0;
	         for(int i=0;i<n;i++)
	         {
	             s[i]=sc.nextLine();
	             length+=s[i].length();
	         }
	         boolean check=true;
	         if(length>(x1.length()+x2.length()))
	           check=false;
	            
	        for(int i=0;(i<n&&check);i++)
	        {
	            for(int j=0;j<s[i].length();j++)
	            {
	                if(m.containsKey(s[i].charAt(j)))
	                {
	                    m.put(s[i].charAt(j),m.get(s[i].charAt(j))-1);
	                    
	                    if(m.get(s[i].charAt(j))==0)
	                      m.remove(s[i].charAt(j));
	                }
	                else
	                {
	                    check=false;
	                    break;
	                }
	            }
	        }
	        
	        if(check)
	          System.out.println("YES");
	        else
	          System.out.println("NO");
	    }
	}
}
