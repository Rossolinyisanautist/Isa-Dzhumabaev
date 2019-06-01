import java.util.*;
import java.util.stream.*;

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x + y == 0){break;}

            int[][] table = new int[x][y];
            int[][] transparent = new int[y][x];
            boolean[] b = new boolean[4];
            int answer = 4;

            for(int i = 0; i < x; i++){
                for(int j = 0; j < y;j++){
                    table[i][j] = sc.nextInt();
                    transparent[j][i] = table[i][j];
                }
                int rowSum = IntStream.of(table[i]).sum();
                if(rowSum == y && !b[0]){
                    answer--;
                    b[0] = true;
                }
                else if(rowSum == 0 && !b[1]){
                    answer--;
                    b[1] = true;
                }
            }
            for(int i = 0; i < transparent.length; i++){
                int columnSum = IntStream.of(transparent[i]).sum();
                if(columnSum == x && !b[2]){
                    answer--;
                    b[2] = true;
                }
                else if(columnSum == 0 && !b[3]){
                    answer--;
                    b[3] = true;
                }
            }
            System.out.println(answer);
        }
    }
}
