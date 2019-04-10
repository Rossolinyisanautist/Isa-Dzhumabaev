import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.println("A four-digit integer?");
        int num = inp.nextInt();
        int sumOfDigits =   num % 10 +
                            num / 10 % 10 +
                            num / 100 % 10 +
                            num / 1000;
        System.out.println("The sum of all digits is "+sumOfDigits);

    }

}
