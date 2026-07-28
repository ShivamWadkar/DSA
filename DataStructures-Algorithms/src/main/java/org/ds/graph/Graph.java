package org.ds.graph;

import java.util.*;

public class Graph {

    private int vertices;
    private List<List<Integer>> adj;

    // ==========================
    // Constructor
    // ==========================
    public Graph(int vertices) {
        this.vertices = vertices;

        adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // ==========================
    // Add Edge (Undirected)
    // ==========================
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // ==========================
    // Remove Edge
    // ==========================
    public void removeEdge(int u, int v) {
        adj.get(u).remove(Integer.valueOf(v));
        adj.get(v).remove(Integer.valueOf(u));
    }

    // ==========================
    // Print Graph
    // ==========================
    public void printGraph() {

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    // ==========================
    // DFS
    // ==========================
    public void dfs(int start) {

        boolean[] visited = new boolean[vertices];

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(int node, boolean[] visited) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    // ==========================
    // BFS
    // ==========================
    public void bfs(int start) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;

        queue.offer(start);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour : adj.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    queue.offer(neighbour);
                }
            }
        }

        System.out.println();
    }

    // ==========================
    // Search Node
    // ==========================
    public boolean hasPath(int source, int destination) {

        boolean[] visited = new boolean[vertices];

        return hasPathDFS(source, destination, visited);
    }

    private boolean hasPathDFS(int current, int destination, boolean[] visited) {

        if (current == destination)
            return true;

        visited[current] = true;

        for (int neighbour : adj.get(current)) {

            if (!visited[neighbour]) {

                if (hasPathDFS(neighbour, destination, visited))
                    return true;
            }
        }

        return false;
    }

    // ==========================
    // Count Connected Components
    // ==========================
    public int connectedComponents() {

        boolean[] visited = new boolean[vertices];

        int count = 0;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                dfsHelper(i, visited);

                count++;
            }
        }

        return count;
    }

    // ==========================
    // Cycle Detection (Undirected)
    // ==========================
    public boolean hasCycle() {

        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (cycleDFS(i, -1, visited))
                    return true;
            }
        }

        return false;
    }

    private boolean cycleDFS(int current, int parent, boolean[] visited) {

        visited[current] = true;

        for (int neighbour : adj.get(current)) {

            if (!visited[neighbour]) {

                if (cycleDFS(neighbour, current, visited))
                    return true;

            } else if (neighbour != parent) {

                return true;
            }
        }

        return false;
    }

    // ==========================
    // Main
    // ==========================
    public static void main(String[] args) {

        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Adjacency List:");
        graph.printGraph();

        System.out.println("\nDFS:");
        graph.dfs(0);

        System.out.println("\nBFS:");
        graph.bfs(0);

        System.out.println("\nPath 0 -> 5:");
        System.out.println(graph.hasPath(0, 5));

        System.out.println("\nConnected Components:");
        System.out.println(graph.connectedComponents());

        System.out.println("\nContains Cycle:");
        System.out.println(graph.hasCycle());

        graph.removeEdge(4,5);

        System.out.println("\nAfter Removing Edge (4,5):");
        graph.printGraph();
    }
}