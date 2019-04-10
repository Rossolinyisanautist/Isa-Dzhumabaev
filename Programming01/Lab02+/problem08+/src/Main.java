import java.util.Scanner;
public class Main {
    final static double KILOS_IN_POUNDS = 0.454;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double weight = inp.nextDouble();
        double weightInKilos = weight*KILOS_IN_POUNDS;
        System.out.printf("%.1f Pound is %.3f kilograms\n", weight, weightInKilos);
    }
}
