import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWorking;
        do{
            System.out.println("Enter number of nodes");
            int numberOfNodes = sc.nextInt();
            int[][] adjMatrix = new int[numberOfNodes][numberOfNodes];

            // Create a graph object
            Graph graph = new Graph();
            // Get Adjacency matrix
            System.out.println("Enter adjacency matrix");
            for(int i = 0; i < adjMatrix.length; i++){
                for(int j = 0; j < adjMatrix.length; j++){
                    // each iteration of i we get 1 row of matrix
                    adjMatrix[i][j] = sc.nextInt();
                }
                // Send this matrix to Node() constructor to
                // create node. Then add it to the graph
                graph.addNode(new Node(adjMatrix[i]));
            }

            // Start depth first search to  traverse the graph
            Search.depthFirstSearch(graph, 0);

            // Check if all nodes were visited
            if(graph.isConnected()){
                System.out.println("Graph is connected");
            }
            else{
                System.err.println("Graph is disconnected");
            }
            System.out.print("Do you want to check another graph? (Y/N):");
            isWorking = sc.next().toUpperCase().equals("Y");

        }while(isWorking);
    }
}
class Node {
    private int[] relations;
    private boolean isVisited;

    Node(int[] relations){
        isVisited = false;
        this.relations = relations;
    }
    int[] getRelations(){
        return relations;
    }
    boolean isVisited(){
        return isVisited;
    }
    void setVisited(){
        isVisited = true;
    }
}
class Graph {

    private ArrayList<Node> nodes;

    Graph(){
        nodes = new ArrayList<>();
    }
    void addNode(Node node){
        nodes.add(node);
    }
    Node getNode(int i){
        return nodes.get(i);
    }
    int getNumberOfNodes(){
        return nodes.size();
    }
    boolean isConnected(){
        for(int i = 0; i < nodes.size(); i++){
            if(!getNode(i).isVisited()){
                return false;
            }
        }
        return true;
    }
}

class Search {
    static int queue;

    Search(){}

    static void depthFirstSearch(Graph graph, int startNodeIndex){
        queue = graph.getNumberOfNodes();

        if(queue == 0){
            return;
        }
        graph.getNode(startNodeIndex).setVisited();
        queue--;

        int[] neighbours = graph.getNode(startNodeIndex).getRelations();

        for(int i = 0; i < neighbours.length; i++){
            if(neighbours[i] == 1 && !graph.getNode(i).isVisited()){
                depthFirstSearch(graph, i);
            }
        }
    }
}

/*
Graph Inputs To Check

true
5
0 1 0 0 0
1 0 1 0 0
0 1 0 1 0
0 0 1 0 1
0 0 0 1 0

false
5
0 1 0 0 0
1 0 1 0 0
0 1 0 0 0
0 0 0 0 1
0 0 0 1 0

false
7
0 1 1 0 0 0 0
1 0 1 0 0 0 0
1 1 0 0 0 0 0
0 0 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

true
7
0 1 1 0 0 0 0
1 0 1 1 0 0 0
1 1 0 0 0 0 0
0 1 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

false
7
0 0 0 0 0 0 1
0 0 0 0 1 1 0
0 0 0 1 0 0 1
0 0 1 0 0 0 0
0 1 0 0 0 1 0
0 1 0 0 1 0 0
1 0 1 0 0 0 0

true
9
0 1 0 0 0 0 0 0 0
1 0 1 0 0 0 0 0 0
0 1 0 1 1 0 0 0 0
0 0 1 0 0 0 0 0 0
0 0 1 0 0 1 1 0 1
0 0 0 0 1 0 1 0 0
0 0 0 0 1 1 0 0 0
0 0 0 0 0 0 0 0 1
0 0 0 0 1 0 0 1 0

false
9
0 1 0 0 0 0 0 0 0
1 0 1 0 0 0 0 0 0
0 1 0 1 1 0 0 0 0
0 0 1 0 0 0 0 0 0
0 0 1 0 0 1 1 0 1
0 0 0 0 1 0 1 0 0
0 0 0 0 1 1 0 0 0
0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0


0 1 1 0 0
1 0 1 1 0
1 1 0 0 0
0 1 0 0 0
0 0 0 0 0

*/