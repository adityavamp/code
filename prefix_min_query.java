import java.util.*;

class Pair {
    long sum, min, total, num;

    Pair(long sum, long min, long total, long num) {
        this.min = min;
        this.sum = sum;
        this.total = total;
        this.num = num;
    }
}

public class prefix_min_query {

    static Pair[] tree;

    static int t;
    static int e, r;

    static Pair result;

    void build(int node, int start, int end, int[] arr) {
        if (start == end) {
            tree[node] = new Pair(arr[start], arr[start], 1, 1);
        } else {
            int mid = (start + end) / 2;
            build(2 * node + 1, start, mid, arr);
            build(2 * node + 2, mid + 1, end, arr);
            Pair a = tree[2 * node + 1], b = tree[2 * node + 2];
            if (a.min <= b.min) {
                tree[node] = new Pair(a.sum + a.min * b.total, a.min, a.total + b.total, a.num + b.total);
            } else {
                result = a;
                e = mid + 1;
                r = end;
                get(mid + 1, end, 0, t - 1, 0, arr);
                tree[node] = new Pair(result.sum, b.min, result.total, result.num);
            }
        }
    }

    void get(int left, int right, int start, int end, int node, int[] arr) {
        if (right < start || end < left||start>e)
            return;
        if (left <= start && end <= right) {
            if (result == null) {
                result = tree[node];
                e = end + 1;
            } else if (e == start) {
                Pair a = result, b = tree[node];
                if (a.min <= b.min) {
                    e = end + 1;
                    result = new Pair(a.sum + a.min * b.total, a.min, a.total + b.total, a.num + b.total);
                } else {
                    int count = 0;
                    for (int i = start; i <= end; i++) {
                        if (arr[i] > a.min) {
                            count++;
                        } else
                            break;
                    }
                    if (count != 0) {
                        e = start + count;
                        result = new Pair(a.sum + count * a.min, a.min, a.total + count, a.total + count);
                        get(start + count, r, 0, t - 1, 0, arr);
                    } else {
                        e = end + 1;
                        result = new Pair(a.sum + b.sum, b.min, a.total + b.total, b.total);
                    }
                }

            }
        } else {
            int mid = (start + end) / 2;
            get(left, r, start, mid, 2 * node + 1, arr);
           if((mid+1)<=e)
            get(left, r, mid + 1, end, 2 * node + 2, arr);
        }
    }

    public static void main(String[] args) {







        .args
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int height = (int) (Math.log(n) / Math.log(2)) + 1;
        int tree_node = (int) Math.pow(2, height + 1);

        tree = new Pair[tree_node];

        t = n;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        new prefix_min_query().build(0, 0, n - 1, arr);

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            result = null;
            r = b - 1;
            e=a-1;
            new prefix_min_query().get(a - 1, b - 1, 0, n - 1, 0, arr);
            System.out.println(result.sum);
        }
    }
}