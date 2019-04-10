import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), limit, i, j, k;
        while(n-- > 0){
            String first = sc.next(), second = sc.next(), combined = "";

            boolean isFirstGreater = first.length() > second.length();

            limit =  isFirstGreater ? second.length() : first.length();

            for(i = j = k = 0; i < 2 * limit; i++)
                    combined = i % 2 == 0 ? combined.concat(first.charAt(j++) + "") //fill even cells
                                          : combined.concat(second.charAt(k++) + ""); //fill odd cells

            i = limit;
            limit = isFirstGreater ? first.length() : second.length();

            for(; i < limit; i++) //Fill remaining cells
                combined = combined.concat((isFirstGreater ? first.charAt(i) : second.charAt(i)) + "");

            System.out.println(combined);
        }
    }
}/*
2
Tpo oCder
aa bb

*/