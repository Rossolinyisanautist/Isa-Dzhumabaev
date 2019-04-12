import java.util.*;

public class Main3 {

    static BitSet isPrime = new BitSet(30000020) ;
    static long[] prime = new long[30000020];
    static long lim = 30000010L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long qtde = 0;
        primo(qtde);

        while(sc.hasNext()) {
            long n = sc.nextLong();
            if (n == 0)
                break;
            else
                System.out.println(fatora(n, qtde));
        }
    }

    static int fatora(long n, long prime_cont) {
        long i = 0;
        int ans = 1;
        int div;
        while (n > 1 && i < prime_cont)
        {
            div = 0;
            while(n > 1 && n % prime[(int)i] == 0)
            {
                n /= prime[(int)i];
                div++;
            }
            i++;
            if (i > 1) ans*= (div + 1);
        }
        if (n > 1) ans *= 2;
        return ans;
    }
    static void primo(long p) {
        int prime_cont = 0;

        prime[prime_cont] = 2;
        prime_cont++;

        isPrime.set(0, isPrime.size(), true);
        for(int i = 3; i <= lim; i += 2)
        {
            if(isPrime.get(i))
            {
                prime[prime_cont++] = i;

                for(long j = i * i; j <= lim; j+= i)
                    isPrime.set(j, false);
            }
        }
    p = prime_cont;
    }
}

