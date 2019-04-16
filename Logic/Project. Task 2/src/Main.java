import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes");
        int numberOfNodes = sc.nextInt();
        int[][] adjMatrix = new int[numberOfNodes][numberOfNodes];

        Graph graph = new Graph();

        System.out.println("Enter adjacency matrix");
        for(int i = 0; i < adjMatrix.length; i++){
            for(int j = 0; j < adjMatrix.length; j++){
                adjMatrix[i][j] = sc.nextInt();
            }
            graph.addNode(new Node(adjMatrix[i]));
        }

        Search.depthFirstSearch(graph, 0);

        if(graph.isConnected()){
            System.out.println("Is connected");
        }
        else{
            System.out.println("is Disconnected");
        }
    }
}/*
5
0 1 0 0 0
1 0 1 0 0
0 1 0 1 0
0 0 1 0 1
0 0 0 1 0

0 1 0 0 0
1 0 1 0 0
0 1 0 0 0
0 0 0 0 1
0 0 0 1 0

0 1 1 0 0 0 0
1 0 1 0 0 0 0
1 1 0 0 0 0 0
0 0 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

0 1 1 0 0 0 0
1 0 1 1 0 0 0
1 1 0 0 0 0 0
0 1 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

*/