import java.util.Scanner;

public class SolutionOfMoritz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), maxLength, i;
        String[] input;
        while (true) {
            maxLength = 0;
            input = new String[n];
            for (i = 0; i < input.length; i++) {
                input[i] = sc.next();
                maxLength = (input[i].length() > maxLength) ? input[i].length() : maxLength;
            }
            for (String string : input)
                System.out.printf(("%" + maxLength + "s%n"), string);

            if ((n = sc.nextInt()) == 0)
                break;
            System.out.println();
        }
    }
}