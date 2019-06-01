//
//class Search {
//    static int queue;
//
//    Search(){}
//
//    static void depthFirstSearch(Graph graph, int startNodeIndex){
//        queue = graph.getNumberOfNodes();
////        new Search(graph.getNumberOfNodes());
//
//        if(queue == 0){
//            return;
//        }
//        graph.getNode(startNodeIndex).setVisited();
//        queue--;
//
//        int[] neighbours = graph.getNode(startNodeIndex).getRelations();
//
//        for(int i = 0; i < neighbours.length; i++){
//            if(neighbours[i] == 1 && !graph.getNode(i).isVisited()){
//                depthFirstSearch(graph, i);
//            }
//        }
//    }
//}
