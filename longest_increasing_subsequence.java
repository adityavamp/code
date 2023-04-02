import java.util.*;


public class longest_increasing_subsequence
{
    int binarysearch(int left,int right,int[] dp,int val)
    {
        if(left==right)
          return left;
        
        int mid=(left+right)/2;

        if(val<=dp[mid])
          return binarysearch(left,mid, dp, val);
        else
          return binarysearch(mid+1, right, dp, val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();

        int[] dp = new int[n];

        dp[0]=arr[0];

        int size=1;

        for(int i=1;i<n;i++)
        {
            if(dp[size-1]>=arr[i])
            {
                int index=new longest_increasing_subsequence().binarysearch(0, size, dp, arr[i]);
                dp[index]=arr[i];
            }
            else
            {
                dp[size]=arr[i];
                size++;
            }
        }

        System.out.println(size);
    }
}