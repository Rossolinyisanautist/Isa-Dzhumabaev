import java.util.ArrayList;

class Search {

    private int queue;
    private Graph graph;
    private ArrayList<Edge> path;

    Search(Graph graph, int numberOfNodes){
        queue = numberOfNodes;
        this.graph = graph;
        path = new ArrayList<>();
    }
    void traverse(int startNodeIndex){
        if(queue == 0){
            return;
        }
        Node node = graph.getNode(startNodeIndex);
        node.setVisited();
        int[] relations = node.getRelations();
        queue--;

        for(int i = 0; i < relations.length; i++){
            if(relations[i] == 1 && !graph.getNode(i).isVisited()){
                traverse(i);
            }
        }
    }
    void FleuryAlgirithm(Integer start) {
        for (int i = 0; i < graph.getAdjacencyMatrix()[start].size(); i++) {
            Integer next = graph.getAdjacencyMatrix()[start].get(i);
            if (isValidEdge(start, next)) {
                path.add(new Edge(start, next));
                graph.removeEdge(start, next);
                FleuryAlgirithm(next);
            }
        }
    }
    ArrayList<Edge> getEulerianPath(){
        return path;
    }
    private boolean isValidEdge(Integer A, Integer B) {
        if (graph.getAdjacencyMatrix()[A].size() == 1) {
            return true;
        }
        boolean[] isVisited = new boolean[graph.getNumberOfNodes()];
        int withEdge = countVisitedNodes(A, isVisited);

        graph.removeEdge(A, B);
        isVisited = new boolean[graph.getNumberOfNodes()];
        int withoutEdge = countVisitedNodes(A, isVisited);

        graph.addEdge(A, B);
        return withEdge <= withoutEdge;
    }

    private int countVisitedNodes(Integer start, boolean[] isVisited) {
        isVisited[start] = true;
        int count = 1;
        for (int adj : graph.getAdjacencyMatrix()[start]) {
            if (!isVisited[adj]) {
                count = count + countVisitedNodes(adj, isVisited);
            }
        }
        return count;
    }

}
