import java.util.*;

public class dijkstra {
    public static void main(String[] args) {
        
    }
     int[] find(int V, ArrayList<ArrayList<ArrayList<Integer>>> a, int S)
    {
        int[] cost = new int[V];
        int[] visited = new int[V];
        int root=S;
        
        for(int j=0;j<V;j++)
        {
            int index=-1;
            for(int i=0;i<a.get(S).size();i++)
            {
                if(a.get(S).get(i).get(0)==root)
                  continue;
                if(cost[a.get(S).get(i).get(0)]==0)
                {
                    cost[a.get(S).get(i).get(0)]=a.get(S).get(i).get(1)+cost[S];
                }
                else
                {
                    cost[a.get(S).get(i).get(0)]=Math.min(cost[a.get(S).get(i).get(0)],a.get(S).get(i).get(1)+cost[S]);
                }
                
                
            }
            visited[S]=1;
            
            for(int i=0;i<V;i++)
            {
                if(visited[i]==0&&cost[i]>0)
                {
                    if(index==-1||cost[index]>cost[i])
                     index=i;
                }
            }
            S=index;
        }
        
        return cost;
    }
}
