import java.util.ArrayList;
import java.util.Iterator;

public class grahDataStructure{
    // breadth for  search BFS
    int v;
    ArrayList<Integer>[] adj;
    grahDataStructure(int noOfVertex){
        v = noOfVertex;
        adj = new ArrayList[v];
        for(int i =0;i<noOfVertex;i++){
            adj[i]=new ArrayList<>();
        }
    }
    void edge(int  x, int y){
        adj[x].add(y);
    }
    void BFS(int sourceVertex){
        boolean[] visited = new boolean[v];
        ArrayList<Integer> a1 =  new ArrayList<Integer>();
        visited[sourceVertex] = true;
        a1.add(sourceVertex);
        while(!a1.isEmpty()){
            sourceVertex = a1.remove(0);
            System.out.print(sourceVertex+" ");
            Iterator i = adj[sourceVertex].iterator();
            while(i.hasNext()){
                int n = (int) i.next();
                if(!visited[n]){
                    visited[n]= true;
                    a1.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
grahDataStructure g1 = new grahDataStructure(6);
g1.edge(0,1);
g1.edge(0,2);
g1.edge(0,5);
g1.edge(1,0);
g1.edge(1,2);
g1.edge(2,0);
g1.edge(2,1);
g1.edge(2,3);
g1.edge(2,4);
g1.edge(3,2);
g1.edge(4,2);
g1.edge(4,5);
g1.edge(5,0);
g1.edge(5,4);
g1.BFS(0);
    }
}
