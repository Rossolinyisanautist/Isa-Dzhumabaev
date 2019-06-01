import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isWorking;
        do{
            System.out.println("Enter number of nodes");
            int numberOfNodes = sc.nextInt();
            int[][] adjMatrix = new int[numberOfNodes][numberOfNodes];
            Graph graph = new Graph(numberOfNodes);

            System.out.println("Enter adjacency matrix");
            for(int i = 0; i < adjMatrix.length; i++){
                for(int j = 0; j < adjMatrix.length; j++){
                    adjMatrix[i][j] = sc.nextInt();
                    if(adjMatrix[i][j] == 1 && adjMatrix[j][i] == 0){
                        graph.addEdge(i, j);
                        adjMatrix[j][i] = 1;
                    }
                }
                graph.addNode(new Node(adjMatrix[i]));
            }
            // PROCESS
            if(graph.isConnected()){
                System.out.println("Graph is connected");
            }
            else{
                System.err.println("Graph is disconnected");
            }
            if(graph.isEulerian() == 1){
                System.out.println("Graph is Eulerian\nPath:");
                ArrayList<Edge> path = graph.findPath();
                for(int i = 0; i < path.size(); i++){
                    System.out.print(path.get(i) + " ");
                }
                System.out.println();
            }
            else if(graph.isEulerian() == 0){
                System.out.println("Graph is semi-Eulerian\nPath:");
                ArrayList<Edge> path = graph.findPath();
                for(int i = 0; i < path.size(); i++){
                    System.out.print(path.get(i) + " ");
                }
                System.out.println();
            }
            else {
                System.out.println("Grap is not Eulerian");
            }
            System.out.print("Do you want to check another graph? (Y/N): ");
            isWorking = sc.next().toUpperCase().equals("Y");

        }while(isWorking);
    }
}
/*
Graph Inputs To Check Connectedness

Connected
Semi-Eulerian
5
0 1 0 0 1
1 0 1 0 0
0 1 0 1 0
0 0 1 0 1
1 0 0 1 0

Disconnected
Not Eulerian
7
0 1 1 0 0 0 0
1 0 1 0 0 0 0
1 1 0 0 0 0 0
0 0 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

Connected
Semi-Eulerian
7
0 1 1 0 0 0 0
1 0 1 1 0 0 0
1 1 0 0 0 0 0
0 1 0 0 1 1 0
0 0 0 1 0 0 1
0 0 0 1 0 0 1
0 0 0 0 1 1 0

Connected
Not Eulerian
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

Connected
semi-Eulerian
6
0 1 1 1 0 1
1 0 1 1 1 0
1 1 0 0 0 1
1 1 0 0 1 1
0 1 0 1 0 1
1 0 1 1 1 0

Connected
Eulerian
7
0 1 1 1 0 1 0
1 0 1 1 1 0 0
1 1 0 0 0 1 1
1 1 0 0 1 1 0
0 1 0 1 0 1 1
1 0 1 1 1 0 0
0 0 1 0 1 0 0

*/
