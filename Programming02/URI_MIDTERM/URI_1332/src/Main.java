import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordList = {"one", "two", "three"};
        int N = sc.nextInt();
        for(int c = 0; c < N; c++){
            String inputWord = sc.next();
            int inputWordLength = inputWord.length();
            int mistakes = 3;
            int answer = -1;
            for(int i = 0; i < wordList.length; i++){
                int listWordLength = wordList[i].length();
                boolean toCheckOrNot = listWordLength == inputWordLength;
                if(toCheckOrNot){
                    mistakes = 0;
                }
                for(int j = 0; j < inputWordLength && toCheckOrNot && mistakes < 2; j++){
                    if (inputWord.charAt(j) != wordList[i].charAt(j)){
                        mistakes++;
                    }
                }
                if(mistakes <= 1){
                    answer = i;
                    break;
                }
            }
            System.out.println(answer + 1);
        }
    }
}
/*

owe
too
theee

*/
