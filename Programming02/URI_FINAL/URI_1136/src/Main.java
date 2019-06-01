import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            int N, B, n = 0;
            int[] list;
            int[] list2;
            boolean[] list3;
            boolean isPossible = true;

            N = sc.nextInt();
            B = sc.nextInt();

            if(N == 0 && N == B){
                break;
            }

            list = new int[B];
            list3 = new boolean[N + 1];

            for(int i = 0; i < B; i++){
                list[i] = sc.nextInt();
            }

            for (int i = 0; i <= B; i++){
                if(i == B){
                    if(n == N) {break;}
                    n++;
                    i = 0;
                    continue;
                }
                for (int j = 0; j < B; j++){
                    int diff = Math.abs(list[i] - list[j]);
                    if(n == diff){
                        list3[n] = true;
                    }
                }
            }

            for(boolean b : list3){
                if(!b){
                    isPossible = false;
                    break;
                }
            }
            System.out.println(isPossible ? "Y" : "N");
        }
    }
}
/*
6 7
2 1 3 4 0 6 5
5 4
5 3 0 1
5 3
1 5 0
0 0

*/