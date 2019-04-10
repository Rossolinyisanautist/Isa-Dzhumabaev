import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        String name = input.nextLine();
        double salary = input.nextFloat();
        double total = (input.nextFloat()*15d)/100d+salary;
        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}
