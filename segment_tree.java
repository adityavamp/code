import java.util.*;


class Tree{
    int[] tree;
    void build_tree(int n)
    {
        tree= new int[n];
    }
    void build(char[] arr,int node,int left,int right)
    {
        if(left==right)
          tree[node]=arr[left]-'a'+1;
        else
        {
            int mid=(left+right)/2;
            build(arr,2*node+1,left,mid);
            build(arr,2*node+2,mid+1,right);

            tree[node]=tree[2*node+1]^tree[2*node+2];
        }
    }

}
public class segment_tree
{
    public static void main(String[] args) {
        
    }
}