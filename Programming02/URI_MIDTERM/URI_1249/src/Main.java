import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz", input, output;
        int shift, index, i;

        while (sc.hasNext()) {
            input = sc.nextLine(); output = "";

            for (i = 0; i < input.length(); i++) {

                if (Character.isAlphabetic(input.charAt(i))) {
                    alphabet = Character.isUpperCase(input.charAt(i)) ? alphabet.toUpperCase()
                                                                      : alphabet.toLowerCase();
                    index = alphabet.indexOf(input.charAt(i));
                    shift = index >= 13 ? -13 : 13;

                    output = output.concat(alphabet.charAt(index + shift) + "");
                } else
                    output = output.concat(input.charAt(i) + "");
            }
            System.out.println(output);
        }
    }
}/*
z
a
x
Hello world!
This is a test message.
abc123<>,xyz?*$
*/