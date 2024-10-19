package nikeeta;

import java.util.*;

public class Graphs {

    static class Edge {
        int src;
        int dest;
        int weight;
        
        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>(); // create empty array list for each index of the array
        }

        graph[0].add(new Edge(0, 2, 0));
        
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 2, 3));
        
        graph[2].add(new Edge(2, 1, 6));
        graph[2].add(new Edge(2, 3, 5));
        
        graph[3].add(new Edge(3, 1, 4));
        graph[3].add(new Edge(3, 0, 9));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graphs = new ArrayList[v];
        CreateGraph(graphs);

        // Print the graph to verify
        for (int i = 0; i < graphs.length; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (Edge edge : graphs[i]) {
                System.out.print(edge.dest + " "+"  " +edge.weight);
            }
            System.out.println();
        }
        
        // for  particular
        for(int i=0; i<graphs[2].size(); i++) {
        	Edge e = graphs[2].get(i);
        	System.out.println(e.dest+"  "+ " "+e.weight );
        }
    }
}
