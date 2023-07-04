package Day146Java64练习;

import java.util.*;

public class DirectedGraph {
    private int V;
    private LinkedList<Integer>[] adjList;

    public DirectedGraph(int v) {
        V = v;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        //adjList[dest].add(src);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int j : adjList[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}

