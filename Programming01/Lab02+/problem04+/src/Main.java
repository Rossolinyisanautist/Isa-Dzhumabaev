import java.util.Scanner;
public class Main {

    final double INCHES_PER_CM = 2.54;

    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);
        System.out.print("Enter Length in Inches: ");
        double inInches = inp.nextInt();
        double inCm = inInches*INCHES_PER_CM;

        System.out.printf("%.2f in. = %.2f cm.&f", inInches, inCm);
    }
}