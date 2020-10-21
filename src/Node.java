public class Node <K,W>{
    K head;
    String data;
    K next;
    K prev;
    K key;
    K endNode;
    W weight;


    public Node(K key, K endNode, W weight){
        this.key = key;
        this.endNode = endNode;
        this.weight = weight;

//        if(head == null){
//            //copy of node
//            Node copyNode = new Node(key,endNode,weight);
//            this.head = copyNode;
//        }


    }

    public String toString(){
        return "{ key: " + key + " , endNode: " + endNode + ", weight: " + weight + " }";
    }
    }
