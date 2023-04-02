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
	        int n1=sc.nextInt();
	        sc.nextLine();
	        String s=sc.nextLine();
	        String s1=sc.nextLine();
	        
	        if(n1>n)
	        {
	            String temp=s;
	            s=s1;
	            s1=temp;
	            int ti=n1;
	            n1=n;
	            n=ti;
	        }
	        Map<Character,Integer> m = new HashMap<>();
	        
	        for(int i=0;i<n;i++)
	        {
	            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
	        }
	        int count=0;
	        boolean check=true;
	        for(int i=0;i<n1;i++)
	        {
	            m.put(s1.charAt(i),m.getOrDefault(s1.charAt(i),0)-1);
	        }
	        
	        for(Map.Entry<Character,Integer> entry:m.entrySet())
	        {
	            if(entry.getValue()<0)
	            {
	                check=false;
	                break;
	            }
	            if(entry.getValue()%2!=0)
	              count++;
	        }
	        if(count>1||!check||(count>0&&(n1+n)%2==0))
	          System.out.println("NO");
	        else
	          System.out.println("YES");
	    }
	}
}
