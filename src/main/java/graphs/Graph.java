package graphs;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int V; //V is the number of nodes

    public Graph(int V){
        this.V = V;
        graph = new ArrayList<>();

        for(int i = 0; i < V; i++){
            graph.add(new ArrayList<>()); //create memory for the inner array lists
        }
    }

    public void addEdge(int v, int u){
//        Since it is an undirected graph we add edges both ways
        if(u >= V || v >= V) System.out.println("Number of nodes exceeded");
        if(v < V) graph.get(v).add(u);
        if(u < V) graph.get(u).add(v);
    }

    public void printGraph(){
        for (int i = 0; i < V; i++){
            System.out.print("Node: " + i);
            for(int j : graph.get(i)) System.out.print("->"+j);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(3,2);
        g.addEdge(2,4);
        g.addEdge(1,4);
        g.addEdge(3,1);
        g.addEdge(2,20);

        g.printGraph();
    }
}
