import java.util.*;

class Graph {

    private ArrayList<Node> nodes;
    private ArrayList<Integer>[] adjacencyMatrix;
    private int numberOfVertices;

    @SuppressWarnings("unchecked")
    Graph(int numOfVertices) {
        this.numberOfVertices = numOfVertices;
        adjacencyMatrix = new ArrayList[numberOfVertices];
        nodes = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyMatrix[i] = new ArrayList<>();
        }
    }
    void addEdge(Integer u, Integer v) {
        adjacencyMatrix[u].add(v);
        adjacencyMatrix[v].add(u);
    }
    void removeEdge(Integer u, Integer v) {
        adjacencyMatrix[u].remove(v);
        adjacencyMatrix[v].remove(u);
    }
    ArrayList<Edge> findPath() {
        Search search = new Search(this, numberOfVertices);
        Integer start = 0;
        for (int i = 0; i < numberOfVertices; i++) {
            if (adjacencyMatrix[i].size() % 2 == 1) {
                start = i;
                break;
            }
        }
        search.FleuryAlgirithm(start);
        return search.getEulerianPath();
    }
    boolean isConnected(){
        Search search = new Search(this, getNumberOfNodes());
        search.traverse(0);
        for(int i = 0; i < nodes.size(); i++){
            if(!getNode(i).isVisited()){
                return false;
            }
        }
        return true;
    }
    void addNode(Node node){
        nodes.add(node);
    }
    Node getNode(int index){
        return nodes.get(index);
    }
    int getNumberOfNodes(){
        return nodes.size();
    }

    ArrayList<Integer>[] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    int isEulerian(){
    if(!isConnected()) {
        return -1;
    }
    int oddCount = 0;
    for(int i = 0; i < nodes.size(); i++){
        int degree = nodes.get(i).getDegree();
        if(degree % 2 != 0){
            oddCount++;
            if(oddCount > 2){
                return -1;
            }
        }
    }
    return oddCount == 0 ? 1 : oddCount == 2 ? 0 : -1;
    }

}