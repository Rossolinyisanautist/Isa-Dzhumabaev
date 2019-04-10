import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Some real number? ");
        double input = scan.nextDouble();
        System.out.println( "|" +input + "|" + " = " + Math.abs(input));
    }
}
