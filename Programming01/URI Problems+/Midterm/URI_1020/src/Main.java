import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long N = longInput();
        long years = N / 365;
        long months = (N-years*365)/30;
        long days = N-years*365-months*30;

        print(Long.toString(years), false);
        print(" ano(s)", true);
        print(Long.toString(months), false);
        print(" mes(es)", true);
        print(Long.toString(days), false);
        print(" dia(s)", true);

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
