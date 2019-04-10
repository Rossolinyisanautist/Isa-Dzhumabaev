import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ip=new Scanner(System.in);
        int[] list = new int [5];
        int j = 0;
        for(int i=0; i<list.length;i++){
            list[i]=ip.nextInt();}
        for(int i=0; i<list.length;i++){
            if (list[i]%2==0){
                j=j+1;
            }}System.out.println(j+" valores pares");
    }
}