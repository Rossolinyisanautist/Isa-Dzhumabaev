import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int c = 0;
        while(c < N){
            char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            String input = sc.nextLine();
            int count = 0;
            for(int i = 0; i < alphabet.length; i++){
                for(int  j = 0; j < input.length(); j++){
                    if(input.charAt(j) == alphabet[i]){
                        alphabet[i] = '+';
                        count++;
                    }
                }
            }
            if(count == 26){
                System.out.println("frase completa");
            }
            else if(count >= 13){
                System.out.println("frase quase completa");
            }
            else{
                System.out.println("frase mal elaborada");
            }
            c++;

        }
    }
}
