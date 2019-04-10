import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 50;
        int[] primes = new int[MAX];
// не получилось найти общее решение чтобы работало с 1 и 2
//        primes[0] = 1;
//        primes[1] = 2;
        boolean isPrime;
        int num = 2;
        for(int j = 0; j < MAX;){
            for(int i = 1; i <= MAX && j < MAX; i++, num++){
                int divisor = 2;
                isPrime = true;
                do{
                    if(num % divisor == 0){
                        isPrime = false;
                        break;
                    }
                    divisor++;
                }while(divisor <= num / 2);
                if(isPrime ){
                    primes[j] = num;
                    j++;}
            }
        }
        System.out.printf("The first %d prime numbers are\n", MAX);
        for(int i = 1; i <= primes.length; i++) {
            if(i % 10 == 0){
                System.out.println(primes[i - 1] + " ");
            }
            else
            System.out.print(primes[i - 1] + " ");
        }
    }
}
