import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();

            boolean isPossible = false;

            int i = 0, sqrt = (int)Math.round(Math.sqrt(n));

            while(sqrt >= i){
                int sum = sqrt * sqrt + i * i;
                if(sum == n){
                    isPossible = true;
                    break; }
                else if(sum < n)
                    i++;
                else
                    sqrt--;
                }

            System.out.println(isPossible ? "YES" : "NO");
        }while(sc.hasNext());
    }
}