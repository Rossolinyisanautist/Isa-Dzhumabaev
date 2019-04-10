import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time = input.nextInt(), speed = input.nextInt(), distance = speed*time;
        //14km/l   1/14
        float fuelNeeded = distance/12f;
        System.out.printf("%.3f\n",fuelNeeded);
    }
}
