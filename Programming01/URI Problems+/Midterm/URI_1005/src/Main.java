import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        float A = input.nextFloat()*3.5f, B = input.nextFloat()*7.5f;
        System.out.printf("MEDIA = %.5f\n",(A+B)/(3.5+7.5));

    }
}
