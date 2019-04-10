import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float input = inp.nextFloat();

        //Working with only integer part of input.
        int valueInt = (int)input;

        int $100 = valueInt/100, remain1 = valueInt%100;
        int $50 = remain1/50, remain2 = remain1%50;
        int $20 = remain2/20, remain3 = remain2%20;
        int $10 = remain3/10, remain4 = remain3%10;
        int $5 = remain4/5, remain5 = remain4%5;
        int $2 = remain5/2;

        System.out.println(     "NOTAS:\n"+
                                $100+" nota(s) de R$ 100.00\n"+
                                $50+" nota(s) de R$ 50.00\n"+
                                $20+" nota(s) de R$ 20.00\n"+
                                $10+" nota(s) de R$ 10.00\n"+
                                $5+" nota(s) de R$ 5.00\n"+
                                $2+" nota(s) de R$ 2.00");

        // Working with decimals now.
        float coins = input - ($100*100+$50*50+$20*20+$10*10+$5*5+$2*2);

        int $1 = (int)coins; double remain01 = coins-$1;
        double $0_50 = remain01 / 0.50, remain02 = remain01 % 0.50;
        double $0_25 = remain02 / 0.25, remain03 = remain02 % 0.25;
        double $0_10 = remain03 / 0.10, remain04 = remain03 % 0.10;
        double $0_05 = remain04 / 0.05, remain05 = remain04 % 0.05;
        double $0_01 = remain05 / 0.01;

        System.out.println(     "MOEDAS:\n"+
                                $1+" moeda(s) de R$ 1.00\n"+
                                (int)$0_50+" moeda(s) de R$ 0.50\n"+
                                (int)$0_25+" moeda(s) de R$ 0.25\n"+
                                (int)$0_10+" moeda(s) de R$ 0.10\n"+
                                (int)$0_05+" moeda(s) de R$ 0.05");
        System.out.printf(      "%.0f moeda(s) de R$ 0.01\n",$0_01);
    }
}
