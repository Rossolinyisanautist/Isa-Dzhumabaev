
import java.util.Scanner;

public class Main {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(N == K && K == 0){break;}
            int[] Q = new int[101];
            for(int i = 0; i < N; i++){
                Q[sc.nextInt()]++;
            }
            int result = 0;
            for(int i = 1; i < 101; i++){
                if(Q[i] >= K){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
