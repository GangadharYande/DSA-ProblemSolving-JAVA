import java.util.ArrayList;

public class AdjacencyListGraph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
        
    }
    public static void createGraph(ArrayList<Edge> graphs[]) {
        for(int i =0;i<graphs.length;i++){
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0,2));

        graphs[1].add(new Edge(1,2));
        graphs[1].add(new Edge(1,3));

        graphs[2].add(new Edge(2,0));
        graphs[2].add(new Edge(2,1));
        graphs[2].add(new Edge(2,3));
        
        graphs[3].add(new Edge(3,1));
        graphs[3].add(new Edge(3,2));

    }
    public static void main(String args[]){
        int vertex =4;

        ArrayList<Edge> graphs[] = new ArrayList[vertex];
    }
}