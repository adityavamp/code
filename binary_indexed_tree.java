import java.util.*;

public class binary_indexed_tree {
    
    static int[] bit=new int[1000];

    void update(int index,int val,int n)
    {
        index++;
        while(index<=n)
        {
            bit[index]+=val;
            index+=index&(-index);
        }
    }

    int getSum(int index,int n)
    {
        int result=0;
        while(index>0)
        {
            System.out.println(index);
            result+=bit[index];
            index-=index&(-index);

        }

        return result;
    }

    void print(int n)
    {
        for(int i=1;i<=n;i++)
         System.out.print(bit[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();


        for(int i=0;i<n;i++)
        {
            new binary_indexed_tree().update(i, arr[i], n);
        }

        // new binary_indexed_tree().print(n);

        System.out.println(new binary_indexed_tree().getSum(4,n)-new binary_indexed_tree().getSum(0, n));
    }
}
