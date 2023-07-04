package Day146Java64练习;

import java.util.*;

public class WeightedGraph {
    private int V;
    private LinkedList<Edge>[] adjList;

    public WeightedGraph(int v) {
        V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        adjList[src].add(edge);
        edge = new Edge(dest, src, weight);
        adjList[dest].add(edge);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (Edge edge : adjList[i]) {
                System.out.print("(" + edge.dest + ", " + edge.weight + ") ");
            }
            System.out.println();
        }
    }

    private class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 4, 8);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 3, 11);
        graph.addEdge(1, 4, 4);
        graph.addEdge(2, 3, 7);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 4, 9);

        graph.printGraph();
    }
}
