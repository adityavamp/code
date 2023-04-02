import java.util.Scanner;

public class goodArray {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t=sc.nextInt();

    while(t-->0)
    {

    int n=sc.nextInt();

    int [] arr = new int[n];

    int count=0;

    arr[0]=sc.nextInt();
    for(int i=1;i<n;i++)
    {
        arr[i]=sc.nextInt();
        if((arr[i-1]%2==0&&arr[i]%2==0)||(arr[i-1]%2!=0&&arr[i]%2!=0))
        {
            count++;
        }
    }
    System.out.println(count);
}
   } 
}
