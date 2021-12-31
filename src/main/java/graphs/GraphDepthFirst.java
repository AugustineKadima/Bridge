package graphs;

import java.util.ArrayList;

public class GraphBreathFirst {
    public static class Graph{
        static ArrayList<ArrayList<Character>> graph;
        static int V;

        public Graph(int v) {
            V = v;
            graph = new ArrayList<>();
            for(int i = 0; i < v; i++){
                graph.add(new ArrayList<>());
            }
        }

        public static void addEdge(int v, char u){
            if(v < V) graph.get(v).add(u);
            else System.out.println("Edge out of range.");
        }

    }

    public static void breathFirstSearch(Graph graph, char source){
        
    }
}
