import java.util.Scanner;

public class emordnilap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int t=sc.nextInt();
    int mod=1000000007;
    while(t-->0)
    {
        int n=sc.nextInt();

        if(n==1)
        {
            System.out.println(0);
        }
        else
        {
            int total=(n-1)*(n)/2;

            System.out.println(total*3);
        }
    }
   } 
}
