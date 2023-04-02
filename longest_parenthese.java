import java.util.*;

public class longest_parenthese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s =sc.nextLine();

        Stack<Integer> p = new Stack<>();
        Stack<Integer> val =new Stack<>();

        int v=0,max=-1;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')')
            {
                p.push(1);
                val.push(v);
                v=0;
            }
            else
            {
                if(p.size()!=0)
                {
                    p.pop();
                    v+=1+val.pop();
                }
                else
                {
                    p.clear();
                    val.clear();
                    v=0;
                }
            }

            max=Math.max(max,v);
        }
        System.out.println(max);
    }    
}
