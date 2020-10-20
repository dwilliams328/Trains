import java.util.LinkedList;

public class Graph {
    //nodes
    int vertices;
    LinkedList<Integer> adjList[];

    //adjlist(Adjacent List) is a LinkedList of Integer obj(nodes).
    //
    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for(int i=0; i < vertices; i++){

            //ERROR: List not populating
            adjList[i] = new LinkedList<>();
            System.out.println(adjList[i]);
        }

    }


    public void addEdge(int source, int destination){
        adjList[source].add(destination);
    }

    void displayGraph(){
        for(int i = 0; i < vertices;i++){
            if(adjList[i].size()>0){
                System.out.println("Vertex " + i + " is connected to:- ");
                for(int j=0; j < adjList[i].size();i++){
                    System.out.print(adjList[i].get(j) + " ");
                }

                System.out.println();
            }
        }
    }
}
