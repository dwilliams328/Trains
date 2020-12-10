public class Node {

    Object[] data = new Object[2];
    Node next;


    public Node(String name) {
        this.data[0] = name;
        this.data[1] = null;
    }

    public Node(String name, Integer weight) {
        this.data[0] = name;
        this.data[1] = weight;
    }
}
