import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0){ break; }
            while(n-- > 0){
                char answers[] = {'A','B','C','D','E'};
                int list[] = new int[5];
                boolean answered = false;
                char answer = '*';
                for(int i = 0; i < 5; i++){
                    list[i] = sc.nextInt();
                    if(list[i] <= 127){
                        if(!answered) {
                            answered = true;
                            answer = answers[i];
                        }
                        else{
                            answer = '*';
                        }
                    }
                }
                System.out.println(answer);
            }
        }
    }
}/*
3
0 255 255 255 255
255 255 255 255 0
255 255 127 255 255
4
200 200 200 0 200
200 1 200 200 1
1 2 3 4 5
255 5 200 130 205
0

*/
