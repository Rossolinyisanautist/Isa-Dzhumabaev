public class Edge {

    private int A;
    private int B;

    Edge(int A, int B){
        this.A = A;
        this.B = B;
    }
    @Override
    public String toString() {
        return "(" + A + "-" + B + ")";
    }
}
