import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0)
        {

        int n=sc.nextInt();
        int k=sc.nextInt();

        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            m.put(a,m.getOrDefault(a, 0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:m.entrySet())
        {
            if(entry.getValue()==1)
              count++;
        }
        if(m.size()>2*k)
          System.out.println("NO");
        else
        {
            int val=2*k-m.size();

            if(val<=(m.size()-count))
              System.out.println("YES");
            else
              System.out.println("NO");
        }
       }

    }
}
