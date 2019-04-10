import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        float A = ip.nextFloat(),X = 0;
        int percent = 0;
            if (A >=  0.00f && A <= 400.00f) {
                X = A / 100f * 15f;
                A = A + X;
                percent = 15;
            }
            else if (A > 400.00f && A <= 800.00f) {
                X = A / 100f * 12f;
                A = A + X;
                percent = 12;
            }
            else if (A > 800.00f && A <= 1200.00f) {
                X = A / 100f * 10f;
                A = A + X;
                percent = 10;
            }
            else if (A > 1200.00f && A <= 2000.00f) {
                X = A / 100f * 7f;
                A = A + X;
                percent = 7;

            }
            else if (A > 2000.00f) {
                X = A / 100f * 4f;
                A = A + X;
                percent = 4;
            }
        System.out.printf("Novo salario: %.2f\n", A);
        System.out.printf("Reajuste ganho: %.2f\n", X);
        System.out.println("Em percentual: "+percent+" %");
    }
}