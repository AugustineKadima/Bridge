package graphs;

import java.util.HashMap;
import java.util.Map;

public class GraphTwo {
    public static HashMap<Character, char[]> graph;
    public static int V;

    public GraphTwo(int V){
        this.V = V;
        graph = new HashMap<>();
    }

    public static void addEdge(char node, char[] neighboursArray){
//        Since it is an undirected graph we add edges both ways
        if(graph.size() < V){
            graph.put(node, neighboursArray);
        }else{
            System.out.println("Graph is full!");
        }


    }

    public static  void printGraph(){
        for(Map.Entry<Character, char[]> entry: graph.entrySet()){
            char key = entry.getKey();
            char[] vals = entry.getValue();
            String valsString = "";
            for(char value : vals ){
                valsString += Character.toString(value) + " ";
            }
            System.out.println(Character.toString(key) + " - "+ valsString);
        }
    }
}
