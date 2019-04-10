// BETTER
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), half; sc.nextLine();

        while (n-- > 0) {
            String  line = new StringBuilder(sc.nextLine()).reverse().toString();
            half = line.length() / 2;
            line = line.substring(half).concat(line.substring(0, half));
            System.out.println(line);
        }
    }
}/*
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE

*/