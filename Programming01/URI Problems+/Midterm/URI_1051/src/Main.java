import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        float A=ip.nextFloat();
        float tax1, x, tax2, z,tax3;
        if (A >= 0.00f && A <= 2000.00f)
            System.out.println("Isento");
        else if (A > 2000.00f && A <= 3000.00f){
            A = A - 2000.00f;
            tax1 = A * 8 / 100;
            System.out.printf("R$ %.2f\n",tax1);}

        else if (A > 3000.00f && A <= 4500.00f){
            A = A - 1000.00f - 2000.00f;
            tax1 = 1000 * 8 / 100;
            tax2 = A * 18 / 100;

            System.out.printf("R$ %.2f\n",tax1+tax2);
        }
        else if (A > 4500.00f){
            A = A - 1000.00f - 2000.00f - 1500.00f;
            tax1 = 1000*8/100;
            tax2 = 1500 * 18 / 100;
            tax3 = A * 28 / 100;
            System.out.printf("R$ %.2f\n",tax1+tax2+tax3);
        }

    }

}