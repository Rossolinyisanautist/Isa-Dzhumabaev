import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] id; int n, time; boolean answer;

        while(true){
            id = new char[n = sc.nextInt()];
            int corrects = 0, currentIncorrects = 0, totalTime = 0;

            int i = 0;
            while(i < n){

                id[i] = sc.next().charAt(0);
                if(i > 0 && id[i] != id[i - 1]){
                    currentIncorrects = 0;
                }
                time = sc.nextInt();
                answer = sc.next().equals("correct");

                if (answer){
                    corrects++;
                    totalTime += time + currentIncorrects * 20;
                }
                else
                    currentIncorrects++;

                i++;
            }
            if(n == 0)
                break;
            System.out.printf("%d %d%n", corrects, totalTime);
        }
    }
}
/*

РАЗНИЦА КОДОВ ПРОЯВЛЯЕТСЯ ПРИ ЭТОМ ИНПУТЕ

4
A 10 incorrect
B 20 correct
C 30 correct
A 40 correct

ЭТОТ КОД(Main2) НЕ СОХРАНЯЕТ КОЛ-ВО НЕВЕРНЫХ САБМИТОВ ДЛЯ КАЖДОЙ ID.
Main СОХРАНЯЕТ И ПОЭТОМУ, ЕСЛИ Я ВВЕДУ МЕЖДУ ОДНИМ И ТЕМ ЖЕ ID ДРУГОЙ ID Main НЕ ОШИБЕТСЯ.

*/
