import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);

        System.out.print("Temperature in degrees Fahrenheit? ");
        double fahrenheit = inp.nextDouble();

        double inCelcius = (fahrenheit - 32)*5/9.0;
        System.out.printf("The temperature in degrees Celsius is %.2f\n ",inCelcius);
    }
}
//*°C+ = (*°F+ − 32) × 5⁄9