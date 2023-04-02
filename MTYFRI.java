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
	        int k=sc.nextInt();
	        
	        List<Integer> a = new ArrayList<>();
	        List<Integer> b = new ArrayList<>();
	        
	        int motu=0,tomu=0;
	        
	        for(int i=0;i<n;i++)
	        {
	            
	            if(i%2==0)
	            {
	                a.add(sc.nextInt());
	                motu+=a.get(a.size()-1);
	            }
	            else 
	            {
	                b.add(sc.nextInt());
	                tomu+=b.get(b.size()-1);
	            }
	        }
	        Collections.sort(a);
	        Collections.sort(b);
	        int ai=a.size()-1;
	        int bi=0;
	        for(int i=0;(i<k&&ai>=0&&bi<b.size());i++)
	        {
	            if(tomu>motu)
	              break;
	            if(a.get(ai)>b.get(bi))
	            {
	                motu=motu-a.get(ai)+b.get(bi);
	                tomu=tomu-b.get(bi)+a.get(ai);
	                ai--;
	                bi++;
	            }
	        }
	        if(tomu>motu)
	          System.out.println("YES");
	        else
	          System.out.println("NO");
	    }
	}
}
