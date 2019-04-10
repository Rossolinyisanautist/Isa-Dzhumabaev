import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        int number;
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            number = sc.nextInt();
            summ += number;
        } while (number != 0);

        System.out.println("Sum of all numbers is " + summ);
    }
}
