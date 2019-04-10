import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a radius and length of a cylinder: ");
        double radius = inp.nextDouble(), length = inp.nextDouble();

        double area = radius*radius*Math.PI;
        double volume = area*length;

        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);
    }
}
