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
	        sc.nextLine();
	        String s=sc.nextLine();
	        
	        List<Integer> l = new ArrayList<>();
	        
	        int minus=0,add=0;
	        
	        
	        for(int i=0;i<n;i++)
	        {
	            if(Character.isDigit(s.charAt(i)))
	            {
	                l.add(s.charAt(i)-'0');
	            }
	            else
	            {
	                if(s.charAt(i)=='-')
	                  minus++;
	                else
	                  add++;
	            }
	        }
	        Collections.sort(l);
	        
	        
	        long sum=0;
	        
	        String result="";
	        
	        while(minus!=0||add!=0)
	        {
	            if(minus!=0)
	            {
	                result=('-'+String.valueOf(l.remove(0)))+result;
	                minus--;
	                
	            }
	            else
	            {
	                result=('+'+String.valueOf(l.remove(0)))+result;
	                add--;
	            }
	        }
	        String a="";
	        while(l.size()!=0)
	         a=l.remove(0)+a;
	         
	        System.out.println(String.valueOf(a)+result);
	        
	    }
	}
}
