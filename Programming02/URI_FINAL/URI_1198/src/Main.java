import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a, b, c;
        while(sc.hasNext()){
            a = new BigInteger(sc.next());
            b = new BigInteger(sc.next());

            c = MyBigInteger.abs(a.subtract(b));

            System.out.println(c);
        }
    }
}
class MyBigInteger {

    private MyBigInteger(){}

    static BigInteger abs(BigInteger x){
        if(x.compareTo(BigInteger.ZERO) < 0){
            return x.negate();
        }
        else{
            return x;
        }
    }
}