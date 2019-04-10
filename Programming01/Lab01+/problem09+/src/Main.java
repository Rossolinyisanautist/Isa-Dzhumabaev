public class Main {
    public static void main(String[] args) {
        float a = 1;
        for (int i = 3; i<=11;i+=4){
            a -= (1.0f / i);
        }
        for (int j = 5;j<=13;j+=4){
            a += (1.0f / j);
        }
        double PI = 4*a;
        System.out.println(PI);
    }
}
