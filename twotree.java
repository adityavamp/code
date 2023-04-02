import java.util.*;
 
class Pair{
    int x,y,tree;
 
    Pair(int x,int y,int tree)
    {
        this.x=x;
        this.y=y;
        this.tree=tree;
    }
}
 
public class twotree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n=sc.nextInt();
 
        ArrayList<ArrayList<int[]>> adj = new ArrayList<ArrayList<int[]>>();

        ArrayList<Map<Integer,Long> >result = new ArrayList<Map<Integer,Long> >();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<int[]>());
        }
 
        int[] visited = new int[n+1];
 
        for(int i=0;i<n-1;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
 
            adj.get(b).add(new int[]{a,c});
        }
        
 
        int[] w = new int[n+1];
        for(int i=1;i<=n;i++)
          w[i]=sc.nextInt();
 
        int p=sc.nextInt();
 
        while(p-->0)
        {
            int j=sc.nextInt();
            int v=sc.nextInt();
            int[] tree1= new int[n+1];
            int[] tree2=new int[n+1];
            tree2[j]=-1;
            int min=Integer.MAX_VALUE;
            Queue<Pair> q = new LinkedList<Pair>();
 
            q.add(new Pair(j, 0,2));

            Map<Integer,Long> m = new HashMap<>();
 
            while(q.size()!=0&&visited[j]==0)
            {
                int node=q.peek().x;
                int val=q.peek().y;
                int t=q.peek().tree;
 
                q.remove();
                long va=m.getOrDefault(node,Long.MAX_VALUE);
                if(t==2)
                {
                    m.put(node,Math.min(va,val));
                }
                else
                {
                    m.put(node,Math.min(va,val+w[node]));
                }

                for(int i=0;i<adj.get(node).size();i++)
                {
                    int[] n1=adj.get(node).get(i);
                    if(t==2)
                    {
                        if(tree2[n1[0]]>(val+2*n1[1])||tree2[n1[0]]==0)
                        {
                            tree2[n1[0]]=val+2*n1[1];
                            q.add(new Pair(n1[0],val+2*n1[1], 2));
                        }
                        if(tree1[node]>(val+w[node])||tree1[node]==0)
                        {
                            tree1[node]=val+w[node];
                            q.add(new Pair(node,val+w[node], 1));
                        }
                    }
                    else
                    {
                        if(tree1[n1[0]]>(val+n1[1])||tree1[n1[0]]==0)
                        {
                            tree1[n1[0]]=val+n1[1];
                            q.add(new Pair(n1[0],val+n1[1], 1));
                        }
                        if(tree2[node]>(val+w[node])||tree2[node]==0)
                        {
                            tree2[node]=val+w[node];
                            q.add(new Pair(node,val+w[node], 2));
                        }
                    }
                }
            }
            if(visited[j]!=0)
              System.out.println(result.get(visited[j]).get(v));
            else
            {
                visited[j]=result.size();
                result.add(new HashMap<Integer,Long>(m));
                System.out.println(result.get(visited[j]).get(v));
            }
 
        }
 
    }
}