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
	      
	      int[][] a= new int[n][2];
	      
	      List<Integer> l =  new ArrayList<Integer>();
	      
	      Map<Integer,Integer> m = new HashMap<>();
	      long total=0;
	      
	      for(int i=0;i<n;i++)
	      {
	       a[i][0]=sc.nextInt();
	       a[i][1]=sc.nextInt();
	       	if(m.containsKey(a[i][0]))
	         {
	              if(m.get(a[i][0])>a[i][1])
	                m.put(a[i][0],a[i][1]);
	         }
	         else
	            m.put(a[i][0],a[i][1]);
	            
	          total+=a[i][1];
	      }
	      long result=0;
	      l.clear();
	      for(Map.Entry<Integer,Integer> entry:m.entrySet())
	        l.add(entry.getValue());
	   
	      Collections.sort(l);
	      
	      int count=m.size();
	      for(int i=0;i<count;i++)
	      {
	          result-=(long)count*l.get(i);
	          result+=(long)(i+1)*l.get(i);
	      }
	        
	       System.out.println(result+(long)(total)*count);
	      
	    }
	}
}
