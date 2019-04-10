import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a != 0){
            double D = b*b - 4*a*c;
            if(D >= 0){
                double rootOfD = Math.sqrt(D);
                double x1 = (-b + rootOfD) / 2;
                double x2 = (-b - rootOfD) / 2;
                if (x1 == x2){
                    System.out.println("The equation has one root "+x1);
                }else
                    System.out.println("The equation has two roots "+x1+" and "+x2);
            }else{
                System.out.println("The equation has no real roots");
            }
        }else{
            System.out.println("It is impossible to find root because of division by zero");
        }
    }
}
