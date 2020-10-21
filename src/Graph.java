import java.util.*;


public class Graph<K,W> {

    //Map 'KEY position' will hold references to Nodes.
    //Map 'Value position' setups List interface with 'Node' 'weight' for LinkedList
    public Map<K, List<Node<K,W>>> G;

    public Graph(){
        G = new HashMap<>();
    }

    // Add edge to graph.
    // to have an edge you must specify 2 vertices.
    // V1 Source node, V2 Destination node, weight units from v1 - v2

    // No Key? good. Graph(g) is a direct graph.
    public boolean addEdge(K v1, K v2, W weight){

        if(!G.containsKey(v1)){
            //implement HashMap [value space] as LinkedList.
            G.put(v1, new LinkedList<>());
        }

        //Key Node stores LinkedList of Nodes(Learning how to: nodes SHOULD reference each other. Not using .next & .prev RN)
        G.get(v1).add(new Node<>(v1,v2,weight));

        return true;
    }

    public String toString(){
        String data = "";

        for(K key: G.keySet()){
            data += key + " ==> [ " + G.get(key) + " ]\n";
        }
        return data;
    }

}
