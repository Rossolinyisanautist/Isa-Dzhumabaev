import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();
        int G = (A+B+Math.abs(A-B))/2;
        int Greatest = (G+C+Math.abs(G-C))/2;
        System.out.println(Greatest+" eh o maior");
    }
}
