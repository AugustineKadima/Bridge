package graphs;

public class GraphDepthFirstRecursive {

    public static void depthFirst(GraphTwo g, char node){
        System.out.println(node);
        for(int i = 0; i < g.graph.get(node).length; i++){
            depthFirst(g, g.graph.get(node)[i]);
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

        GraphDepthFirstRecursive.depthFirst(graph, 'a');
    }
}
