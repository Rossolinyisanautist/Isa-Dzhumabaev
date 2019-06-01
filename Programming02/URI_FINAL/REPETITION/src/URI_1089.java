import java.util.Scanner;

public class URI_1089{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboard = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

        do{
            char[] input = sc.nextLine().toCharArray();
            for(int i = 0; i < input.length; i++){
                char character = input[i];
                if(character != ' '){
                    int index = keyboard.indexOf(character);
                    input[i] = keyboard.charAt(index - 1);
                }
            }
            System.out.println(new String(input));

        }while(sc.hasNext());
    }
}