import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);
        final int MAX = 10;
        final int MIN = 0;
        int corrects = 0;
        int incorrects = 0;

        System.out.print("Number of tests: ");
        int N = inp.nextInt();

        int i = 0;
        while (i < N){
            int a = (int) (MIN + Math.random() * (MAX + 1 - MIN));
            int b = (int) (MIN + Math.random() * (MAX + 1 - MIN));

            System.out.printf("%d + %d = ", a, b);
            int answer = inp.nextInt();

            if(answer == a + b){
                corrects++;
            }
            else
                incorrects++;
            i++;
        }
        System.out.println("Correct answers: " + corrects);
        System.out.println("Inorrect answers: " + incorrects);
    }
}
