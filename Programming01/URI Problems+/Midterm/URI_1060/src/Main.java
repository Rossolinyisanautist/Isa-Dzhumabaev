import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner ip = new Scanner(System.in);
        float A = ip.nextFloat(), B = ip.nextFloat(), C = ip.nextFloat(), D = ip.nextFloat(), E = ip.nextFloat(), F = ip.nextFloat();
        float[] list = {A,B,C,D,E,F};
        int j=0;
        for (float i:list){
            if (i>0){
                j=j+1;}}
        System.out.println(j + " valores positivos");

    }

}