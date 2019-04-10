import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float summ = number;
        int numberOfInputs = 0;
        for (; number != 0;){
            number = sc.nextInt();
            summ += number;
            numberOfInputs++;
        }
        System.out.println(numberOfInputs == 0 ? "Nothing to calculate" : "Average is " + summ / numberOfInputs);
    }
}