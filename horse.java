import java.util.*;
import java.io.*;

public class horse {
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
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            int[] arr = new int[m + 1];

            int count = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (a > m)
                    count++;
                else
                    arr[a]++;
            }
            while (x > 0) {
                int min = 1, max = 1;
                for (int i = 1; i <= m; i++) {
                    if (arr[max] < arr[i])
                        max = i;
                    if (arr[min] > arr[i])
                        min = i;
                }
                arr[min]++;
              if(count<=0)
                arr[max]--;
            
                count--;
                x--;
            }
            int min = 1;
            for (int i = 1; i <= m; i++) {
                if (arr[min] > arr[i])
                    min = i;
            }

            System.out.println(arr[min]);
        }
    }
}
