import java.util.Scanner;

class trees{

    int[] tree;

    void in(int n)
    {
        tree= new int[n];
    }

    void build(int start,int end,int node,char[] arr)
    {
        if(start==end)
        {
            int v=arr[start]-'a'+1;
            tree[node]=1<<v;
        }
        else
        {
            int mid=(start+end)/2;

            build(start,mid,2*node+1,arr);
            build(mid+1,end,2*node+2,arr);

            tree[node]=tree[2*node+1]^tree[2*node+2];
        }
    }

    void set(int start,int end,int index,int node,char val)
    {
        if(start==end)
        {
            int v=val-'a'+1;
            tree[node]=1<<v;
            return;
        }
        else
        {
            int mid=(start+end)/2;

            if(start<=index&&index<=mid)
              set(start,mid,index,2*node+1,val);
            else
              set(mid+1,end,index,2*node+2,val);

            tree[node]=tree[2*node+1]^tree[2*node+2];
        }
    }

    int query(int start,int end,int left,int right,int node)
    {
        if(right<start||end<left)
          return 0;
        
        int mid=(start+end)/2;

        if(left<=start&&end<=right)
          return tree[node];
        
        return query(start,mid,left,right,2*node+1)^query(mid+1,end, left, right,2*node+2);
    }
}

public class is_palindrom {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();

        int n=s.length();

        int height=(int)(Math.log(n)/Math.log(2))+1;

        int tree_node=(int)(Math.pow(2,height+1));

        char[] arr=s.toCharArray();

        trees tree= new trees();

        tree.in(tree_node);

        tree.build(0, n-1, 0, arr);


        int t=sc.nextInt();

        while(t-->0)
        {
            int q=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();

            if(q==1)
            {
                char c=sc.next().charAt(0);
                
                for(int i=l-1;i<r;i++)
                    tree.set(0,n,i,0,c);
                

            }
            else
            {
                int a=tree.query(0, n, l-1, r-1,0);
                if((a&(a-1))==0)
                  System.out.println("Yes");
                else
                 System.out.println("No");
            }
        }
    }
}
