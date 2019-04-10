import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip = new Scanner(System.in);
        int A = ip.nextInt();
        int[] list = new int[A];
        list[A - 1] = A;
        for (int i = 1; i < A && A >= 1 && A <= 1000; i++) {
            list[i-1]=i;
        }
        for (int i:list)
            if (i%2 != 0){
                System.out.println(i);
            }

    }

}