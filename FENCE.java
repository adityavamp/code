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
	        int n=sc.nextInt(),ma=sc.nextInt(),k=sc.nextInt();
	        
	        int[][] ty= new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
	        
	        Map<Integer,List<Integer>>m = new HashMap<>();
	        
	        for(int i=0;i<k;i++)
	        {
	            int a=sc.nextInt(),b=sc.nextInt();
	            if(!m.containsKey(a))
	            {
	                m.put(a,new ArrayList<Integer>());
	            }
	            m.get(a).add(b);
	        }
	        int count=0;
	        for(int i:m.keySet())
	        {
	            for(int j:m.get(i))
	            {
	                for(int p=0;p<4;p++)
	                {
	                    if(!m.containsKey(ty[p][0]+i)||!m.get(ty[p][0]+i).contains(ty[p][1]+j))
	                      count++;
	                }
	            }
	        }
	        
	        System.out.println(count);
	    }
	}
}
