package graphs;

import java.util.Stack;

public class GraphDepthFirst {

    public static void depthFirstPrint(GraphTwo g, char source){
        Stack<Character> graphChars = new Stack<>();
        graphChars.push(source);
        while(graphChars.size() > 0){
            char current = graphChars.pop();
            System.out.println(current);
            for(int i = 0; i < g.graph.get(current).length; i++){
                graphChars.push(g.graph.get(current)[i]);
            }
        }
    }


    public static void main(String[] args) {
        GraphTwo graph = new GraphTwo(6);
        GraphTwo.addEdge('a', new char[]{'b', 'c'});
        GraphTwo.addEdge('b', new char[]{'d'});
        GraphTwo.addEdge('c', new char[]{'e'});
        GraphTwo.addEdge('d', new char[]{'f'});
        GraphTwo.addEdge('e', new char[]{});
        GraphTwo.addEdge('f', new char[]{});

        GraphDepthFirst.depthFirstPrint(graph, 'a');
    }
}


