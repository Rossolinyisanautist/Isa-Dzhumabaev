import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String UsersName = input.nextLine();

        System.out.println("Hello, "+ UsersName+".");
    }
}
