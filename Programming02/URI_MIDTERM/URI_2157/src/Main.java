import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){

            String word = "", reverse;
            int first = sc.nextInt(),
                second = sc.nextInt();

            while(first <= second)
                word = word.concat("" + first++);

            reverse = new StringBuilder(word).reverse().toString();

            System.out.println(word + reverse);
        }
    }
}
// 10 13
// 1011121331211101
// 1011121331211101
// 98 101
// 98991001011010019989
// 98991001011010019989