import java.util.stream.*;

class Node {

    private int[] relations;
    private boolean isVisited;
    private int degree;

    Node(int[] relations){
        this.relations = relations;
        isVisited = false;
        degree = IntStream.of(relations).sum();
    }
    boolean isVisited(){
        return isVisited;
    }
    void setVisited(){
        isVisited = true;
    }
    int getDegree(){
        return degree;
    }
    int[] getRelations(){
        return relations;
    }
}
