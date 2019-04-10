import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String[] String = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner ip=new Scanner(System.in);
        int A=ip.nextInt()-1;
        System.out.println(String[A]);
    }
}