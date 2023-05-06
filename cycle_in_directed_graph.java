import java.util.*;

public class cycle_in_directed_graph
{

    boolean[] c,visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int m=sc.nextInt();

        int[][] mat = new int[m][2];

        for(int i=0;i<m;i++)
        {
            mat[i][0]=sc.nextInt();
            mat[i][1]=sc.nextInt();
        }

       new cycle_in_directed_graph().findcycle(n,mat);
    }

    boolean findcycle(int n,int[][] mat)
    {
        c= new boolean[n+1];

        visited = new boolean[n+1];

        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n+1;i++)
          a.add(new ArrayList<Integer>());

        for(int i=0;i<mat.length;i++)
          a.get(mat[i][0]).add(mat[i][1]);

        for(int i=0;i<=n;i++)
        { 
            if(cycle(i,a))
            {
                System.out.println("true");
                return true;
            }

        }
        System.out.println("false");
        return false;
        
        
    }

    boolean cycle(int node,ArrayList<ArrayList<Integer>>a)
    {
        c[node]=true;
        visited[node]=true;


        for(int i=0;i<a.get(node).size();i++)
        {
            if(c[a.get(node).get(i)])
              return true;
            
            if(visited[a.get(node).get(i)])
             return false;
            
            if(cycle(a.get(node).get(i),a))
              return true;
        }
        c[node]=false;

        return false;
    }
}
