/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc = new FastReader();
	    PrintWriter pw = new PrintWriter(System.out);
	    int t = sc.nextInt();
	    long mod = 1000000000 + 7;
	    long fact[] = new long[1000001];
	    fact[0] = 0;
	    fact[1] = 1;
	    for(int i=2;i<=1000000;i++){
	        fact[i] = (fact[i-1]*i)%mod;
	    }
	    while(t-- > 0){
	        int n = sc.nextInt();
	        long ans = 0;
	        for(int i=0;i<n;i++){
	            int x = sc.nextInt();
	            ans = (ans + fact[x])%mod;
	        }
	        pw.println(ans);
	    }
	    pw.flush();
	}
	
	public static int gcd(int a, int b)
    {
        if(a < b){
            return gcd(b,a);
        }
        if (b == 0)
            return a;
        return gcd(b, a % b); 
    }
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
