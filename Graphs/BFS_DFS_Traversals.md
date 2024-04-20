# BFS and DFS Traversals on Graphs

This markdown file provides an overview of Breadth-First Search (BFS) and Depth-First Search (DFS) algorithms for graph traversal, along with their time complexities.

## Table of Contents

- [BFS (Breadth-First Search)](#bfs)
- [DFS (Depth-First Search)](#dfs)
- [Time Complexity](#time-complexity)

## BFS (Breadth-First Search) <a name="bfs"></a>

BFS is a graph traversal algorithm that explores all the neighboring nodes at the present depth before moving on to nodes at the next depth level. It uses a queue data structure to keep track of nodes to be visited.

### Algorithm

1. Enqueue the starting node and mark it as visited.
2. Dequeue a node and visit it.
3. Enqueue all its neighbors that have not been visited and mark them as visited.
4. Repeat steps 2-3 until the queue is empty.

### Applications

- Shortest path in an unweighted graph
- Web crawling
- Network broadcasting

## DFS (Depth-First Search) <a name="dfs"></a>

DFS is a graph traversal algorithm that explores as far as possible along each branch before backtracking. It uses a stack data structure (can be implemented using recursion) to keep track of nodes to be visited.

### Algorithm

1. Push the starting node onto a stack and mark it as visited.
2. Pop a node from the stack and visit it.
3. Push all its unvisited neighbors onto the stack and mark them as visited.
4. Repeat steps 2-3 until the stack is empty.

### Applications

- Topological sorting
- Solving puzzles with only one solution
- Finding connected components

## Time Complexity <a name="time-complexity"></a>

The time complexity of BFS and DFS depends on the data structure used to represent the graph and the number of nodes and edges in the graph.

### BFS Time Complexity

- **Adjacency Matrix**: O(V^2) (where V is the number of vertices)
- **Adjacency List**: O(V + E) (where V is the number of vertices and E is the number of edges)

### DFS Time Complexity

- **Adjacency Matrix**: O(V^2) (where V is the number of vertices)
- **Adjacency List**: O(V + E) (where V is the number of vertices and E is the number of edges)

In both BFS and DFS, the time complexity is typically determined by the number of vertices (V) and edges (E) in the graph.
