import java.util.Scanner;

public class segtree {

    int[] segmenttree;

    public void build(int start,int end,char[] c,int i)
    {
        System.out.println(start+" "+end+" "+i);
        if(start==end)
          segmenttree[i]=(int)(c[start]-'a');
        else
        {
            int mid=(start+end)/2;
            build(start,mid,c,i*2+1);
            build(mid+1,end,c,i*2+2);
            segmenttree[i]=segmenttree[2*i+1]+segmenttree[2*i+2];
        }

    }
    
    public static void main(String[] args) {
        new segtree().find();
    }
    public void find()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int height = (int)( Math.log(c.length)/Math.log(2) )+ 1;
        
        int tree_nodes = (int) Math.pow(2, height+1);

        System.out.println(tree_nodes);

        segmenttree= new int[tree_nodes];

        build(0,c.length-1,c,0);

        for(int i:segmenttree)
          System.out.print(i+" ");
        
        System.out.println();
    }
}
