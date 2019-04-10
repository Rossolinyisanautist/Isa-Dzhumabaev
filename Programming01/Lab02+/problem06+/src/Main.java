import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = inp.nextDouble();

        double inFahrenheit = (9/5d)*celsius+32d;
        System.out.printf("%.0f Celsius is %.1f Fahrenheit",celsius, inFahrenheit);
    }
}

