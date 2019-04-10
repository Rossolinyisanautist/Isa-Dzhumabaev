import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int c = 0;
        while(c < n){
            int numberOfPeople = sc.nextInt();
            sc.nextLine();
            String[] input = new String[numberOfPeople];
            for(int i = 0; i < input.length; i++){
                input[i] = sc.next();
            }
            boolean isEnglish = false;
            for(int i = 0; i < input.length; i++){
                if(!input[i].equals(input[0])){
                    System.out.println("ingles");
                    isEnglish = true;
                    break;
                }
            }
            if(!isEnglish){
                System.out.println(input[0]);
            }
            c++;
        }
    }
}