import java.util.ArrayList;
import java.util.Stack;

public class graphDataStructureDFS {
    int v;
    ArrayList<Integer>[] adj;
    graphDataStructureDFS(int Vertex){
        adj = new ArrayList[Vertex];
        this.v = Vertex;
        for(int i=0;i<Vertex;i++){
            adj[i]=new ArrayList<>();
        }
    }
    void edge(int x ,int y){
        adj[x].add(y);
    }
    void DFS(int sourceVertex) {
        boolean[] visited = new boolean[v];
        Stack<Integer> s1 = new Stack<>();
        s1.push(sourceVertex);
        int node;
        while (!s1.empty()) {
            sourceVertex = s1.peek();
            s1.pop();
            for (int i = 0; i < adj[sourceVertex].size(); i++) {
                node = adj[sourceVertex].get(i);
                if (!visited[node]) {
                    s1.push(node);
                }
            }
            if (visited[sourceVertex] == false) {
                System.out.print(sourceVertex + " ");
                visited[sourceVertex] = true;
            }
        }
    }
    public static void main(String[] args) {
        graphDataStructureDFS g = new graphDataStructureDFS(6);
        g.edge(0,1);
        g.edge(0,2);
        g.edge(1,0);
        g.edge(1,2);
        g.edge(2,1);
        g.edge(2,0);
        g.edge(2,3);
        g.edge(2,4);
        g.edge(3,2);
        g.edge(4,2);
        g.edge(4,5);
        g.edge(5,0);
        g.edge(5,4);
        System.out.println("The result of depth first search:-");
        g.DFS(0);

    }
}
