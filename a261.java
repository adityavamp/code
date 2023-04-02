import java.util.*;

class amap
{
    public Map<Integer,Integer> m;

    amap()
    {
        m = new HashMap<>();
    }
}

public class a261 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int n=sc.nextInt();

        amap[] left = new amap[n];
        amap[] right = new amap[n];
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(right[i]);
            left[i].m.put(arr[i],left[i].m.getOrDefault(arr[i],0)+1);
            right[n-i-1].m.put(arr[n-i-1],right[n-i-1].m.getOrDefault(arr[n-i-1],0)+1);
            if(i!=0)
            {
                left[i].m.putAll(left[i-1].m);
                right[i].m.putAll(right[n-i].m);
            }   
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(left[i].m);
            System.out.println(right[i].m);
        }
    }
}
