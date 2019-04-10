import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            BigDecimal num = new BigDecimal(sc.next());
            BigDecimal fractional = num.remainder(BigDecimal.ONE);
            BigDecimal cutoff = new BigDecimal(sc.next());
            BigInteger intNum;

            if(fractional.compareTo(cutoff) >= 0){
                intNum = num.add(new BigDecimal("1")).toBigInteger(); }
            else
                intNum = num.toBigInteger();
            System.out.println(intNum);
        }while(sc.hasNext());
    }
}
/*
003.656930
0.5000
.001
0.0001
1.99999999
0.9999
135
0.6531
135.
0.6531
1356.13671
0.1367
0.00010001
0.0001


*/