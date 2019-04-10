import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        // 1km/2min
        // 0.5km/min
        int neededTime = distance*2;
        System.out.println(neededTime+" minutos");
    }
}
