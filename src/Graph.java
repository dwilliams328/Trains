import java.lang.reflect.Array;
import java.util.*;

public class Graph {

    //map of vertices & edges respectively
    public HashMap<Node, LinkedList<Node>> adjList = new HashMap<>();

    //map of Node and index occupied in LinkedList
    public HashMap<Node, Integer> indices = new HashMap<>();

    int index = -1;

    //Each vertex in ArrayList act as keys in HashMap [adjList & indices]
    public Graph(ArrayList<Node> vertices) {

        for (int i = 0; i < vertices.size(); i++) {
            Node vertex = vertices.get(i);
            LinkedList<Node> list = new LinkedList<>();
            adjList.put(vertex, list);
            indices.put(vertex, ++index);
        }
    }

    //Update LinkedList values in adjList HashMap for edge connection.
    public void addEdge(Node source, String destination, Integer weight) {
        LinkedList<Node> list;

        //Reference to source Vertex
        list = adjList.get(source);

        list.push(new Node(destination,weight));

        adjList.put(source,list);

    }

    public void printGraph(){
        Set<Node> set = adjList.keySet();
        Iterator<Node> iterator = set.iterator();

        while (iterator.hasNext()){
            Node vertex = iterator.next();
            System.out.print("Vertex " + vertex.data[0] + " is connected to: ");
            LinkedList<Node> list = adjList.get(vertex);

            for(int i=0; i<list.size(); i++){
                System.out.print("[" + list.get(i).data[0] + " edge size " + list.get(i).data[1] + "] ");
            }
            System.out.println();
        }
    }
}