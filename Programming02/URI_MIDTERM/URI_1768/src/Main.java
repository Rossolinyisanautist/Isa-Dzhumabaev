import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            int n = sc.nextInt(), i = n / 2, k = 0;

            String asterisk = "*";
            while(i-- >= 0){
                System.out.printf(("%" + (n - i - 1) + "s%n"), asterisk);
                asterisk = asterisk.concat("**");
                }

            asterisk = "*";     i = n / 2;
            while(i-- >= 0 && k++ < 2){
                System.out.printf(("%" + (n - i - 1) + "s%n"), asterisk);
                asterisk = asterisk.concat("**");
                }
            System.out.println();
        }while(sc.hasNext());
    }
}