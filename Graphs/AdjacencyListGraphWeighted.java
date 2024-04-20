import java.util.ArrayList;

public class AdjacencyListGraphWeighted {

    // Inner class to represent an edge with source, destination, and weight
    static class Edge {
        int src;     // source vertex of the edge
        int dest;    // destination vertex of the edge
        int weight;  // weight or cost associated with the edge

        // Constructor to initialize edge with source, destination, and weight
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Method to create a weighted graph represented using an adjacency list
    public static void createGraph(ArrayList<Edge> graphs[]) {
        // Initialize each list in the array with a new ArrayList
        for(int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }

        // Adding edges to the graph
        graphs[0].add(new Edge(0, 2, 2));

        graphs[1].add(new Edge(1, 2, 10));
        graphs[1].add(new Edge(1, 3, 0));

        graphs[2].add(new Edge(2, 0, 2));
        graphs[2].add(new Edge(2, 1, 10));
        graphs[2].add(new Edge(2, 3, -1));
        
        graphs[3].add(new Edge(3, 1, 0));
        graphs[3].add(new Edge(3, 2, -1));
    }

    // Main method to test the adjacency list representation
    public static void main(String args[]) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        
        // Create the graph
        createGraph(graph);

        // Printing neighbors of vertex 2 along with their weights
        System.out.println("Neighbours of vertex 2 with weights:");
        for(int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.weight);
        }
    }
}
