import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int input() {
        Scanner inp = new Scanner(System.in);
        int userInput = inp.nextInt();
        return userInput;
    }
    public static void multiplier (int userInput){
        //int[] list = new int[1000];
        if (userInput>1&&userInput<1000){
            for (int i =1; i<11;i++){
                int result = userInput*i;
                System.out.println(i+" x "+userInput+" = "+result);
            }
        }
    }
    public static void main(String[] args) {
        Main.multiplier(Main.input());
    }
}
