import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            BigInteger input =  factorial(new BigInteger(sc.next())).
                    add(factorial(new BigInteger(sc.next())));

            System.out.println(input.toString());
        }while(sc.hasNext());
    }
    static BigInteger factorial(BigInteger number){
        int n = Integer.parseInt(number.toString());
        BigInteger result = new BigInteger("1");
        while(n > 1){
            result = result.multiply(new BigInteger(Integer.toString(n)));
            n--;
        }
    return result;}
}
