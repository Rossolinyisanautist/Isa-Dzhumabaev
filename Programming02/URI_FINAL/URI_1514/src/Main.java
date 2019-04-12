import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            boolean[] b = new boolean[4];
            b[0] = b[1] = b[2] = b[3] = true;

            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N + M == 0)
                break;

            int[][] matrix = new int[N][M];
            int[] rowSum =   new int[N];
            int[]columnSum = new int[M];
            int result = 0;

            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    matrix[i][j] = sc.nextInt();
                    columnSum[j] += matrix[i][j];
                    rowSum[i] += matrix[i][j];
                }
            }
            for(int i = 0; i < rowSum.length; i++){
                if(rowSum[i] == 0)
                    b[3] = false;
                if(rowSum[i] == M)
                    b[0] = false;
            }
            for(int j = 0; j < columnSum.length; j++){
                if(columnSum[j] == 0)
                    b[1] = false;
                if(columnSum[j] == N)
                    b[2] = false;
            }
            for(boolean bool : b)
                if(bool)
                    result++;

            System.out.println(result);
        }
    }
}
