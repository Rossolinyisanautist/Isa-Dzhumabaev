import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int n = sc.nextInt(), count;
        sc.nextLine();

        while (n-- > 0){
            input = sc.nextLine();
            count = 0;
            String aplhabet = "abcdefghijklmnopqrstuvwxyz";

            for( char c : input.toCharArray()){
                if(aplhabet.contains(c +"")){
                    count++;
                    aplhabet = aplhabet.replaceAll(c + "", "");
                }
            }
            if(count >= 26)
                System.out.println("frase completa");
            else if(count >= 13)
                System.out.println("frase quase completa");
            else
                System.out.println("frase mal elaborada");

        }
    }
}