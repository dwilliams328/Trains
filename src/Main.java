public class Main {
    public static void main(String[] args){
        Graph g = new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0);

        g.displayGraph();
    }
}
