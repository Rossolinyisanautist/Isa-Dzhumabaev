import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        int possitive = 0;
        float summ = 0;

        int i = 0;
        while ( i<6 ){
            float A = ip.nextFloat();
            if (A > 0){
                possitive += 1;
                summ = summ+A;
            }
            i++;
        }
        System.out.println(possitive+" valores positivos");
        System.out.printf("%.1f\n",summ/possitive);
    }

}