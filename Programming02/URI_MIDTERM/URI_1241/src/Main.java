import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- > 0){
            String A = sc.next(), B = sc.next();
            if(A.endsWith(B))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}
/*

4
56234523485723854755454545478690 78690
5434554 543
1243 1243
54 64545454545454545454545454545454554

*/


