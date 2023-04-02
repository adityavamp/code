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
	    sc.nextLine();

	    while(t-->0)
	    {
	      String s =sc.nextLine();
	      
	      boolean ans=true;
	      
	      int j=s.length()-2;

	      for(int i=0;i<s.length();i++)
	      {
	          if(j>-1&&s.charAt(i)!=s.charAt(j))
	          {
	              ans=false;
	              break;
	          }
	          j++;
	          j=j%s.length();
	      }
	      
	      if(ans)
	       System.out.println("YES");
	      else
	        System.out.println("NO");
	    }
	}
}
