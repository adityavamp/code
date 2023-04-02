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
	    

	        new Codechef().find();
	}
	public void find()
	{
	    Scanner sc = new Scanner(System.in);
	    int w=sc.nextInt();
	    
	    while(w-->0)
	    {
	    int n=sc.nextInt();
	    
	    int[][] t=new int[][]{{0,0},{1,0},{0,1},{-1,0},{0,-1}};
	    int[][] k=new int[][]{{1,2},{-1,2},{-1,-2},{1,-2},{2,1},{-2,1},{-2,-1},{2,-1}};
	    
	    List<String> l = new ArrayList<>();
	    
	    for(int i=0;i<n;i++)
	    {
	        int row=sc.nextInt(),col=sc.nextInt();
	        String s=String.valueOf(row)+" "+String.valueOf(col);
	        l.add(s);
	    } 
	    
	        
	    int a=sc.nextInt(),b=sc.nextInt();
	    int count=0;
	    for(int i=0;i<t.length;i++)
	    {
	        int r=a+t[i][0],c=b+t[i][1];
	        
	        for(int j=0;j<k.length;j++)
	        {
	            int row=r+k[j][0],col=c+k[j][1];
	            
	            String s=String.valueOf(row)+" "+String.valueOf(col);
	            
	            if(l.contains(s))
	            {
	                count++;
	                break;
	            }
	        }
	    }
	    
	    System.out.println((count!=5)?"NO":"YES");
	    }
	}
}
