import java.util.*;
import java.io.*;

public class largest {
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

        System.out.println(s.length());

        char[] c= s.toCharArray();

        int t=sc.nextInt();
        int k=s.length()-t;
        
        int index=0,j=index;

        StringBuilder r=new StringBuilder();

        int n=s.length();

        while(j<n)
        {
          index=j;
          for(int i=index;i<=(j+t)&&i<n;i++)
          {
            if(c[i]>c[index])
            {
                index=i;
            }
          }
          t-=(index-j);
          r.append(c[index]);

          if(r.length()==k)
            break;
            
          j=index+1;
        }
        System.out.println(r);
        
    }
}
