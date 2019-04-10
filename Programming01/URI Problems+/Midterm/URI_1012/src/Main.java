import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float A = input.nextFloat(),B = input.nextFloat(),C = input.nextFloat();
        float rectTriangleArea = A/2*C;
        float areaOfTrapezium = (C/2)*(A+B);
        float areaOfSquare = B*B;
        float areaOfRectsngel = A*B;
        double areaOfCircle = 3.14159*C*C;  //must be double or wrong answer 5%

        System.out.printf("TRIANGULO: %.3f\n" , rectTriangleArea);
        System.out.printf("CIRCULO: %.3f\n" , areaOfCircle);
        System.out.printf("TRAPEZIO: %.3f\n" , areaOfTrapezium);
        System.out.printf("QUADRADO: %.3f\n" , areaOfSquare);
        System.out.printf("RETANGULO: %.3f\n", areaOfRectsngel);
    }
}
