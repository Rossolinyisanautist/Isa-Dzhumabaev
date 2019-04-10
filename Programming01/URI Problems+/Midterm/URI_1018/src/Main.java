import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int _100 = value / 100, remain100 = value % 100;
        int _50 = remain100 / 50, remain50 = remain100 % 50;
        int _20 = remain50 / 20, remain20 = remain50 % 20;
        int _10 = remain20 / 10, remain10 = remain20 % 10;
        int _5 = remain10 / 5, remain5 = remain10 % 5;
        int _2 = remain5/2, remain2 = remain5%2;
        int _1 = remain2/1;

        System.out.print(

                value+"\n"+
                _100+" nota(s) de R$ 100,00\n"+
                _50+" nota(s) de R$ 50,00\n"+
                _20+" nota(s) de R$ 20,00\n"+
                _10+" nota(s) de R$ 10,00\n"+
                _5+" nota(s) de R$ 5,00\n"+
                _2+" nota(s) de R$ 2,00\n"+
                _1+" nota(s) de R$ 1,00\n");
    }
}
