import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int C = sc.nextInt();
            if(A == 0 && C == 0){ break; }

            int[] list = new int[C];
            int result = 0;

            for(int i = 0; i < C; ++i){
                list[i] = sc.nextInt();
                if(i > 0){
                    if(list[i - 1] > list[i]) {
                        result += (list[i - 1] - list[i]);
                    }
                }else{
                    result += (A - list[i]);
                }
            }
            System.out.println(result);
        }
        
    }
}/*
5 8
1 2 3 2 0 3 4 5
3 3
1 0 2
4 3
4 4 1
0 0
*/