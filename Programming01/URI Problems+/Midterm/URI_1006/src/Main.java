import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float A = input.nextFloat()*2, B = input.nextFloat()*3, C = input.nextFloat()*5;
        System.out.printf("MEDIA = %.1f\n",(A+B+C)/10);
    }
}
