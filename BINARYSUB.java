import java.util.*;
import java.io.*;

public class Main{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                String s=in.nextLine();
                new Solving().sol(s,0,s.length());
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

class Solving
{
    Integer[] dp;
    int mod=998244353;
	public void sol(String s,int i,int n)
	{
	    dp=new Integer[n];
	    System.out.println(helper(s,i,n)+1);
	}
	public int helper(String s,int i,int n)
	{
	    if(i>=n)
	     return 0;
	    if(dp[i]!=null)
	     return dp[i];
	    
	    int value=0;
	    value=helper(s,i+1,n);
	    
	    if(i+1<n&&(((s.charAt(i)=='a'&&s.charAt(i+1)=='b'))||((s.charAt(i)=='b'&&s.charAt(i+1)=='a'))))
	     {
	       //  System.out.println("i "+i);
	         value+=1+helper(s,i+2,n);
	         
	     }
	   // System.out.println(i+" "+value);
	    return dp[i]=value%mod;
	}
}