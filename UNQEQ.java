/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int arr1[]=new int[N];
            ArrayList<Integer>arrlist2 = new ArrayList<Integer>();
            ArrayList<Integer>arrlist3 = new ArrayList<Integer>();
            int sum1 = 0;
            int sum2 = 0;
            if(N==2 || N==0 || N%2!=0){
                System.out.println("NO");
            }else{
                for(int i=0;i<N;i++){
                    arr1[i]=i+1;
                }
                for(int i=0;i<N/2;i++){
                    if(i%2==0){
                        sum1=sum1+arr1[i];
                        arrlist2.add(arr1[i]);
                    }else{
                        sum2=sum2+arr1[i];
                        arrlist3.add(arr1[i]);
                    }
                }
                for(int i=N/2;i<arr1.length;i++){
                    if(i%2==0){
                        sum2=sum2+arr1[i];
                        arrlist3.add(arr1[i]);
                    }else{
                        sum1=sum1+arr1[i];
                        arrlist2.add(arr1[i]);
                    }
                }
                if(sum1==sum2){
                    System.out.println("YES");
                    for(int i=0;i<arrlist2.size();i++){
                        System.out.print(arrlist2.get(i)+" ");
                    }
                    System.out.println();
                    for(int i=0;i<arrlist3.size();i++){
                        System.out.print(arrlist3.get(i)+" ");
                    }
                    System.out.println();
                }else{
                    System.out.println("NO");
                }
            }
        }
	}
}
