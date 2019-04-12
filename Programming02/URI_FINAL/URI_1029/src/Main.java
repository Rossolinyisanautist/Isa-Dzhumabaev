import java.util.*;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0){
            int n = sc.nextInt();
            int fibN = fib(n);
            System.out.printf("fib(%d) = %d calls",n, count, fibN);
            count = 0;
        }
    }
    static int fib(int n){
        count++;
        if(n == 1){
            return 1;
        }
        if(n == 0)
            return 0;
        int fibN = fib(n - 1) + fib(n - 2);
    return fibN;
    }
}
