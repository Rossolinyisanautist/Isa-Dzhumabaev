import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two coordinates of point: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double distance = Math.sqrt(x*x + y*y);
        if (distance < 10){
            System.out.println("point is in the circle");
        }else{
            System.out.println("point is not in the circle");
        }
    }
}
