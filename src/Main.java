import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Graph<String,Integer> g = new Graph<>();

        g.addEdge("A","B",7);
        g.addEdge("C","A",5);
        g.addEdge("C","D",1);
        g.addEdge("E","C",2);

        System.out.println(g);

    }
}
