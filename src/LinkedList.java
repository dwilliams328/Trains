import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {
    public static Node head;

    //List of Nodes
    //public static ArrayList<Node> listOfCities;

    public LinkedList() {
    }

    //Nodes exist inside LinkedList, but can be access/created by Main class
    public static class Node {
        //Node Data
        ArrayList<String> cityName;
        ArrayList<String> destinations;
        ArrayList<Integer> weight;

        //Reference next node in Singly LinkedList
        Node next;

        public Node(ArrayList<String> cityName, ArrayList<String> destination, ArrayList<Integer> weight){
            this.cityName.add(cityName.get(0));
            this.destinations.add(destination.get(0));
            this.weight.add(weight.get(0));
        }

        //Add node and its' data to LinkedList.
        public boolean addNode(ArrayList<String> cityName, ArrayList<String> destination, ArrayList<Integer> weight) {
            //First Node is head of Singly LinkedList
            if (head == null) {
                head = new Node(cityName, destination, weight);
            }
            //Traverse LinkList to find last Node. Add New Node as Last in LL Obj
            else {
                Node currNode = head;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }

                currNode.next = new Node(cityName, destination, weight);
            }

            return true;
        }

        public void printList() {
            Node n = head;
            while (n != null) {
                System.out.print("CityNames: " + n.cityName + " weight: " + n.weight + " destinations: " + n.destinations);
                n = n.next;
            }
        }
    }
}