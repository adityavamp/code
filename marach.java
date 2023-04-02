import java.util.*;
import java.io.*;

public class marach {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        String s=sc.nextLine();

        int t=sc.nextInt();
        int k=s.length()-t;

        // System.out.println(s.length());
        
        int index=0,j=index;

        StringBuilder r=new StringBuilder();

        while(j<s.length())
        {
          index=j;
          String r2=""+s.charAt(index);
          int count=0;
          for(int i=index+1;i<=(j+t)&&i<s.length();i++)
          {
            if((int)(s.charAt(i)-'0')>(int)(s.charAt(index)-'0'))
            {
                index=i;
                count=(index-j);
                r2=""+s.charAt(index);
            }
            else if((int)(s.charAt(i)-'0')==9)
            {
                if((r.length()+r2.length())==k)
                  break;
                
                r2+=s.charAt(i);
                count+=(i-index)-1;
                index=i;
            }
          }
          t-=(count);
          r.append(r2);

          if(r.length()==k)
            break;
          j=index+1;
        }
        System.out.println(r);
        
    }
}
