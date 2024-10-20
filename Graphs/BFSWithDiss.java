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

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
    }

    
    public static void BFS(ArrayList<Edge> graph[], int v, boolean vis[], int start) {
    	Queue<Integer> q = new LinkedList<>();
    	
    	
    	q.add(start);
    	
    	while(!q.isEmpty()) {
    		int curr = q.remove();
    		if(!vis[curr]) {
    			System.out.println(curr);
    			vis[curr] = true;
    		
    		for(int i=0; i<graph[curr].size(); i++) {
    			Edge e = graph[curr].get(i);
    			q.add(e.dest);
    		}
    	}
    
    }
		
    	System.out.println();
    	
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graphs = new ArrayList[v];
        CreateGraph(graphs);

        // Print the graph to verify
        for (int i = 0; i < graphs.length; i++) {
            //System.out.print("Vertex " + i + " is connected to: ");
            for (Edge edge : graphs[i]) {
               // System.out.print(edge.dest + " "+"  " +edge.weight);
            }
          //  System.out.println();
        }
        
        // for  particular
        boolean[] vis = new boolean[v];
        
        for(int i=0; i<graphs[2].size(); i++) {
        	Edge e = graphs[2].get(i);
        	//System.out.println(e.dest+"  "+ " "+e.weight );
        }
        
        for(int i=0; i<v; i++) {
        BFS(graphs,v,vis,i);
        }
    }
}
