import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();

        double[][] matrix = new double[12][12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matrix[i][j] = sc.nextFloat();
            }
        }
        double sum = 0, limJ = 0;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < limJ; j++){
                sum += matrix[i][j];
            }
            limJ++;
        }
        System.out.printf("%.1f%n", operation.equals("S") ? sum : sum / 66d);
    }
    static void printSomething(){
        System.out.println("Something");
    }
}
