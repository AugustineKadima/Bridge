package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class GraphDepthFirst {
    public class Graph{
        static ArrayList<Character> next_neighbour;
        static Map<Character, ArrayList<Character>> graph;
        static char Node;

        public Graph(char node, char neighbour) {
            this.Node = node;
            graph = new HashMap<>();
            next_neighbour = new ArrayList<>();
            next_neighbour.add(neighbour);
            graph.put(node, next_neighbour);

        }
    }

    public static void depthFirstSearch(Graph graph, char source){
        Stack<Character> myStack = new Stack<>();
        myStack.add(source);

        while (!myStack.isEmpty()){
            char current = myStack.pop();
            System.out.println(current);

        }

    }

    public static void main(String[] args) {
//        Graph ac = new Graph('a', 'c');
//        Graph ab = new Graph('a', 'b');
//        Graph bd = new Graph('b', 'd');
//        Graph ce = new Graph('c', 'e');
//        Graph df = new Graph('d', 'f');
//
//        GraphDepthFirst.depthFirstSearch(ac, 'a');
    }
}
