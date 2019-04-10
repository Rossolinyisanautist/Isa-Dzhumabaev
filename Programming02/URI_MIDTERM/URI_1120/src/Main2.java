import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit, number;
        BigInteger d, n, zero = new BigInteger("0");

        while(true){
            digit = sc.next();
            number = sc.next();

            d = new BigInteger(digit);
            n = new BigInteger(number);

            if(d.equals(zero) && n.equals(zero))
                break;
            number = number.replaceAll(digit,"").replaceAll("^0+", "");
            System.out.println(number.isEmpty() ? 0 : number);
        }
    }
}
/*

5 5000000
3 123456
9 23454324543423
9 99999999991999999
7 777
0 0
*/
