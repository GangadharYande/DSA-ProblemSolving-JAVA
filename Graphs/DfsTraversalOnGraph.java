import java.util.ArrayList;

public class DfsTraversalOnGraph {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            // Initialize each element of the graph array with a new ArrayList<Edge>
            graph[i] = new ArrayList<Edge>();
        }
        
        // Define edges for each vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
    }

    public static void DepthFirstSearch(ArrayList<Edge>[] graph, int curr, boolean visited[]) {
        // Print the current vertex
        System.out.print(curr + " ");
        visited[curr] = true;

        // Traverse all adjacent vertices of the current vertex
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {  // Check if the adjacent vertex is not visited
                DepthFirstSearch(graph, e.dest, visited);
            }
        }
    }

    public static void main(String args[]) {
        int vertex = 7;

        ArrayList<Edge> graph[] = new ArrayList[vertex];

        createGraph(graph);

        boolean visited[] = new boolean[vertex];

        // Start DFS traversal from vertex 0
        DepthFirstSearch(graph, 0, visited);
    }
}
