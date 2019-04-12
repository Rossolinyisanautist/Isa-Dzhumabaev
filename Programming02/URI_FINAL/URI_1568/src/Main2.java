import java.lang.reflect.Array;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long N = sc.nextLong();
            long count = 1;

            if(isPossible(N)){
                count += counter(N);
            }
            System.out.println(count);
        }
    }
    static long counter(long N){
        var count = 0;

        for(long L = 1; L * (L + 1) < 2 * N; L++){
            double a = (( N - (L * (L + 1)) / 2d) / (L + 1));

            if(a - (long)a == 0.0){
                count++;
            }
        }
    return count;
    }
    static boolean isPossible(long n) {
        return (((n & (n - 1)) != 0) && n != 0);
    }
}

 class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long N = sc.nextLong();
            long count = 1;

            long sum = ((1 + N) * N ) / 2;
            System.out.println(sum);

            lol(8 & 9);
            System.out.println();
        }
    }
    static int lol(int n){
        System.out.println(n);
        return n;
    }
}
/*

*/