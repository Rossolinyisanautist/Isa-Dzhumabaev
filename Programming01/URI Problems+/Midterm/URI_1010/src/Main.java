import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int code1 = input.nextInt(), quantity1 = input.nextInt();
        float price1 = input.nextFloat();

        int code2 = input.nextInt(), quantity2 = input.nextInt();
        float price2 = input.nextFloat();
        float ValueToPay = quantity1*price1+quantity2*price2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",ValueToPay);
    }
}
