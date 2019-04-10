import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int X = 0, Y = 0 ;
        do{
            X = ip.nextInt(); Y = ip.nextInt();
            if(X>0) {
                if (Y>0)
                    System.out.println("primeiro");
                else if (Y<0)
                    System.out.println("quarto");
            }
            else if(X<0){
                if (Y>0)
                    System.out.println("segundo");
                else if (Y<0)
                    System.out.println("terceiro");
            }
        }while (X!=0&&Y!=0);
    }
}