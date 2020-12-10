import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList<Node> vertices = new ArrayList<>();

        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);
        vertices.add(e);

        Graph graph = new Graph(vertices);

        graph.addEdge(a,"B",5);
        graph.addEdge(a,"D",5);
        graph.addEdge(a,"E",7);
        graph.addEdge(b,"C",4);
        graph.addEdge(c,"D",8);
        graph.addEdge(c,"E",2);
        graph.addEdge(d,"C",8);
        graph.addEdge(d,"E",6);
        graph.addEdge(e,"B",3);

        graph.printGraph();

    }
}


