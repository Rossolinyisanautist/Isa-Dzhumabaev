import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long N = longInput();
        long hours = N / (60 * 60);
        long mins = N / 60 - (hours * 60);
        long secs = N % 60;

        print(Long.toString(hours), false);
        print(":", false);
        print(Long.toString(mins), false);
        print(":", false);
        print(Long.toString(secs), true);
    }

    public static void print(String toPrint, boolean nextLine) {
        if (nextLine)
            System.out.println(toPrint);
        else
            System.out.print(toPrint);
    }


    public static long longInput() {
        Scanner inp = new Scanner(System.in);
        long input = inp.nextLong();
        return input;
    }

    public static double floatInput() {
        Scanner inp = new Scanner(System.in);
        double input = inp.nextDouble();
        return input;
    }

    public static String stringInput() {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        return input;
    }


    public static double calculator(long x, long y, String operation) {
        double result = 0;
        if (operation.equals("+"))
            result = x + y;
        else if (operation.equals("-"))
            result = x - y;
        else if (operation.equals("*"))
            result = x * y;
        else if (operation.equals("/"))
            result = x / y;
        return result;
    }

}
