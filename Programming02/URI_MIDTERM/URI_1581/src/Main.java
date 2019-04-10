import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i;
        boolean isEnglish;

        while(n-- > 0){
            String[] input = new String[sc.nextInt()];

            for(i = 0; i < input.length; i++)
                input[i] = sc.next();

            isEnglish = false;

            for(String language: input)
                if(!language.equals(input[0])){
                    isEnglish = true;
                    System.out.println("ingles");
                    break;
                }
            System.out.print(!isEnglish ? input[0] + "\n" : "");
        }
    }
}