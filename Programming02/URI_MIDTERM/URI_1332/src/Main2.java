import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), answer;
        while(N-- > 0) {
            answer = 3;
            String inputWord = sc.next();
            if(inputWord.length() != 5){
                if(inputWord.matches(".ne|o.e|on."))
                    answer = 1;
                else
                    answer = 2;
            }
            System.out.println(answer);
        }
    }
}