import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        int even = 0, odd = 0, positive = 0, negative = 0;
        for(int i = 0; i < 5; i++){
            int A = ip.nextInt();
            if (A%2 == 0){
                even++;
            }else if(A%2 != 0){
                odd++;
            }if (A > 0){
                positive++;
            }else if (A < 0){
                negative++;
            }
        }

        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");

    }

}