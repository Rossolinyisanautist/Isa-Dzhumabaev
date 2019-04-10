import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int employee_number = input.nextInt(), hours = input.nextInt();
        float valuePerHour = input.nextFloat();
        System.out.println("NUMBER = "+ employee_number);
        System.out.printf("SALARY = U$ %.2f\n", hours*valuePerHour);
    }
}
