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
	    

	        int n=sc.nextInt(),c=sc.nextInt();
	        
	        Map<String,String> r = new HashMap<>();
	        Map<String,Integer> chef = new HashMap<>();
	        Map<String,Integer> country = new HashMap<>();
	        
	        for(int i=0;i<n;i++)
	        {
	            r.put(sc.next(),sc.next());
	        }
	        
	        for(int i=0;i<c;i++)
	        {
	            String s=sc.next();
	            chef.put(s,chef.getOrDefault(s,0)+1);
	            country.put(r.get(s),country.getOrDefault(r.get(s),0)+1);
	        }
	        
	        int old=0;
	        String result="z";
	        for(Map.Entry<String,Integer> entry:country.entrySet())
	        {
	            if(entry.getValue()>old)
	            {
	                old=entry.getValue();
	                result=entry.getKey();
	            }
	            else if(entry.getValue()==old)
	             {
	                if(entry.getKey().compareTo(result)<0)
	                  result=entry.getKey();
	             }
	        }
	
	        System.out.println(result);
	        old=0;
	        result="z";
	        for(Map.Entry<String,Integer> entry:chef.entrySet())
	        {
	            if(entry.getValue()>old)
	            {
	                old=entry.getValue();
	                result=entry.getKey();
	            }
	            else if(entry.getValue()==old)
	             {
	                if(entry.getKey().compareTo(result)<0)
	                  result=entry.getKey();
	             }
	        }
	        System.out.println(result);
	    
	}
}
