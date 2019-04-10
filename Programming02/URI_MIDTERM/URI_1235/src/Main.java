
//BULLSHIT Main2 IS MUCH BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), length, k; sc.nextLine();

        while (n-- > 0) {
            String input = sc.nextLine(), output = "";
            length = input.length();

            k = length / 2 - 1;
            do {
                output = output.concat(input.charAt(k) + "");
                if(k == 0)
                    k = length;
            }while(--k != length / 2 - 1);

            System.out.println(output.trim());
        }
    }
}
/*
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE

*/
