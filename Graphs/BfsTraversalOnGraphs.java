import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversalOnGraphs {

    // Edge class to represent an edge between two vertices
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Function to initialize the graph with empty adjacency lists
    public static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each vertex's adjacency list
        for (int i = 0; i < graph.length; i++) {
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

    // Function to perform Breadth First Search (BFS) traversal on the graph
    public static void bfs(ArrayList<Edge>[] graph, int v) {
        Queue<Integer> q = new LinkedList<>(); // Queue to store vertices for BFS traversal
        boolean vis[] = new boolean[v]; // Array to mark visited vertices
        q.add(0); // Start BFS from vertex 0

        while (!q.isEmpty()) {
            int curr = q.remove(); // Dequeue current vertex

            // Check if the current vertex is not visited
            if (!vis[curr]) {
                System.out.print(curr + " "); // Print the current vertex
                vis[curr] = true; // Mark current vertex as visited
                
                // Add all adjacent vertices of the current vertex to the queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        int vertex = 7; // Total number of vertices in the graph
        ArrayList<Edge> graph[] = new ArrayList[vertex]; // Array of ArrayLists to represent the graph

        /*
          Graph representation:
         
             1----3
            /     | \
           0      |  5---6
            \     | /
             2----4
         
           */

        createGraph(graph); // Initialize the graph
        bfs(graph, vertex); // Perform BFS traversal starting from vertex 0
    }
}
