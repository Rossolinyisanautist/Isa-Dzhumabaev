import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Integer? ");
        int integer = sc.nextInt();
        int summ = 0;
        while (integer != 0){
            int lastDigit = integer % 10;
            summ += lastDigit;
            integer = integer / 10;
        }
        System.out.println("Sum of all digits is"+summ);
    }
}