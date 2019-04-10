import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totalDistance = input.nextInt();
        float fuelSpent = input.nextFloat();
        float consumption = totalDistance/fuelSpent;
        System.out.printf("%.3f",consumption);
        System.out.println(" km/l");
    }
}
