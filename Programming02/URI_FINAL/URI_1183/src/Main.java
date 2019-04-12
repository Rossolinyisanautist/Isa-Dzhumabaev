import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();

        double[][] matrix = new double[12][12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                matrix[i][j] = sc.nextFloat();
            }
        }
        int start = 11;
        double sum = 0;
        for(int i = 1; i < 12; i++){
            for(int j = start; j < 12; j++){
                sum += matrix[i][j];
            }
            start--;
        }
        System.out.printf("%.1f%n", operation.equals("S") ? sum : sum / 66d);
    }
}
