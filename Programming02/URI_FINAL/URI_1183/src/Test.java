public class Test {

    protected int variable = 50;

    protected void method(){}
    public static void main(String[] args) {
    }
    public long factorial(int n){
        if(n == 0)
            return 1;
        return factorial(n - 1) * n;
    }
}
class Test2 extends Test {
    public long factorial(int n){
    return super.factorial(n);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.factorial(6));
    }
}
