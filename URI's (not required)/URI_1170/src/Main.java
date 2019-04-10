import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), days;
        while(n-- > 0){
            days = 0;
            double supplies = sc.nextDouble();

            while (supplies > 1d){
                supplies /= 2;
                days++;
            }
            System.out.println(days + " dias");
        }
    }
}
