import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        int X = ip.nextInt();

        for (int i = X; i <= X+12;i++){
            if (i%2 != 0)
                System.out.println(i);}

    }

}