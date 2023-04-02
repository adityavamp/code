import java.util.*;
import java.io.*;

public class remainder {
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

        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt(),r=sc.nextInt();

            long[] dp = new long[n+2];

            long zero=0;

            for(int i=1;i<=n;i++)
            {
                int div=n/i;
                int rem=n-i*div;

                dp[rem]++;
                dp[i-1]+=div;
                zero+=div;
            }
            dp[0]=zero;
            long val=0;
            boolean flag=true;

            for(int i=n;i>-1;i--)
            {
                dp[i]+=dp[i+1];
                val+=dp[i];

                if(val>=r)
                {
                    System.out.println(i);
                    flag=false;
                    break;
                }
            }
           if(flag)
            System.out.println(-1);
        }
    }
}
