import java.util.ArrayList;

public class AdjacencyListGraph {

    // Inner class to represent an edge between two vertices
    static class Edge {
        int src;  // source vertex of the edge
        int dest; // destination vertex of the edge

        // Constructor to initialize edge with source and destination
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create an adjacency list representation of an undirected unweighted graph
    public static void createGraph(ArrayList<Edge> graphs[]) {
        
        // Initializing each ArrayList in the array to avoid NullPointerException
        for(int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        
        graphs[0].add(new Edge(0, 2));  // Edge between vertex 0 and vertex 2

        graphs[1].add(new Edge(1, 2));  // Edge between vertex 1 and vertex 2
        graphs[1].add(new Edge(1, 3));  // Edge between vertex 1 and vertex 3

        graphs[2].add(new Edge(2, 0));  // Edge between vertex 2 and vertex 0
        graphs[2].add(new Edge(2, 1));  // Edge between vertex 2 and vertex 1
        graphs[2].add(new Edge(2, 3));  // Edge between vertex 2 and vertex 3
        
        graphs[3].add(new Edge(3, 1));  // Edge between vertex 3 and vertex 1
        graphs[3].add(new Edge(3, 2));  // Edge between vertex 3 and vertex 2
    }

    // Main method to test the adjacency list representation
    public static void main(String args[]) {
        int vertex = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graphs[] = new ArrayList[vertex];

        // Create the graph
        createGraph(graphs);

        // Print the neighbors of vertex 2
        System.out.println("Neighbours of vertex 2:");
        for(int i = 0; i < graphs[2].size(); i++) {
            Edge e = graphs[2].get(i);
            System.out.println("Destination: " + e.dest);
        }
    }
}
