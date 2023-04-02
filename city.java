import java.util.*;
import java.io.*;
class pair
{
    int x,y;
    pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}


public class city {
    static int[] tree;
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
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n + 1; i++)
            a.add(new ArrayList<Integer>());

        for (int i = 0; i < (n - 1); i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            a.get(b).add(c);
            a.get(c).add(b);
        }
        new city().graph(n,a);
    }

    public void graph(int n,ArrayList<ArrayList<Integer>> a) {
        tree = new int[n + 1];

        Queue<pair> q =new LinkedList<pair>();

        int[] visited= new int[n+1];

        q.add(new pair(1,0));

        while(q.size()!=0)
        {
            int node=q.peek().x;
            int sum=q.peek().y;


            q.remove();

            for(int i=0;i<a.get(node).size();i++)
            {
                if(visited[a.get(node).get(i)]==0)
                {
                    visited[a.get(node).get(i)]=1;
                    int val=(a.get(node).get(i) + node) ^ sum;
                    tree[a.get(node).get(i)]=val;
                    q.add(new pair(a.get(node).get(i),val));
                }
            }
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                sum=sum^(tree[i]^tree[j]);
            }
        }

        System.out.println(sum);

    }
}
