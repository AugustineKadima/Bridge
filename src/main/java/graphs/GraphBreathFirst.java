package graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class GraphBreathFirst {

    public  static void breathFirstPrint(GraphTwo g, char node){
        Queue<Character> charQueue = new ArrayDeque<>();
        charQueue.add(node);
            while(charQueue.size() > 0){
            char current = charQueue.remove();
            System.out.println(current);
            for(int i = 0; i < g.graph.get(current).length; i++){
                charQueue.add(g.graph.get(current)[i]);

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

        GraphBreathFirst.breathFirstPrint(graph, 'a');

    }
}
