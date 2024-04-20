## Graphs Data Structure Notes

## Vertex

A vertex, also known as a node, is a fundamental part of a graph. It can represent entities like cities in a map, people in a social network, or any other object.

## Directionality in Graphs

### Unidirectional Graph

In an unidirectional or directed graph, edges have a direction associated with them. If there's an edge from vertex A to vertex B, it doesn't necessarily mean there's an edge from B to A.

### Bidirectional/Undirectional Graph

In a bidirectional or undirected graph, edges don't have a direction. If there's an edge between vertex A and vertex B, it implies there's an edge from B to A as well.

## Edges Based on Weight

Edges in a graph can also have weights. This weight can represent various metrics like distance, cost, or any other value associated with the connection between vertices.

## Storing a Graph

### Adjacency Matrix

An adjacency matrix is a 2D array of size V x V, where V is the number of vertices in the graph. For an unweighted graph, the matrix stores 1 (or some non-zero value) if there is an edge between the vertices, otherwise 0. For a weighted graph, the weight of the edge is stored.

### Adjacency List

An adjacency list represents a graph as an array of lists. The size of the array is equal to the number of vertices. Each entry in the array is a list that contains the neighbors of the vertex corresponding to that entry. For a weighted graph, the list can also contain pairs (or triples) with the neighbor vertex and the weight of the edge.

### Other Ways

- **Edge List**: A list of all the edges in the graph.
- **Incidence Matrix**: A matrix representation where rows represent vertices and columns represent edges.

## Adjacency Representation

The adjacency representation of a graph is a popular and efficient way to store and work with graphs. It can be either an adjacency matrix or an adjacency list, as mentioned above.

### Adjacency Matrix Example

For a graph with 4 vertices and edges based on the provided Java code:

```
   | 0 | 1 | 2 | 3 |
---|---|---|---|---|
 0 | 0 | 0 | 1 | 0 |
 1 | 0 | 0 | 1 | 1 |
 2 | 1 | 1 | 0 | 1 |
 3 | 0 | 1 | 1 | 0 |
```

In this matrix:


![graph](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/efc07a8b-9a2c-401b-8aa9-a2eb1fde9f7f)

- Vertex 0 is connected to vertex 2.
- Vertex 1 is connected to vertices 2 and 3.
- Vertex 2 is connected to vertices 0, 1, and 3.
- Vertex 3 is connected to vertices 1 and 2.

### Bidirectional/Undirectional Graph Structural Implementation

The Structural Implementation is the same as for Bidirectional/Undirectional Weighted Graph  but weight  associated with the edge  as shown below 

![graph](https://github.com/GangadharYande/DSA-ProblemSolving-JAVA/assets/36783781/aba968ba-e61a-4170-9371-5157a6394f00)


Graph Visualization

These notes provide a brief overview of the basic concepts related to graphs, including vertices, directionality, edge weights, and storage methods.
Understanding these fundamentals is crucial for working with graphs in various applications like network analysis, route planning, and more.
