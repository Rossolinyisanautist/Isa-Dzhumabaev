import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime;

        while(n-- > 0){
            BigInteger number = new BigInteger(sc.next());
            isPrime = number.isProbablePrime(1);
            System.out.println(isPrime ? "Prime" : "Not Prime");
        }
    }
}/*
3
123321
123
103
*/