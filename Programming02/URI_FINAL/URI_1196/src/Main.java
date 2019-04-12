import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboardTable =  "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        do{
            char[] input = sc.nextLine().toCharArray();

            for(int i = 0; i < input.length; i++){
                char c = input[i];
                if(!("" + c).matches("[`QAZ ]")){
                    input[i] = keyboardTable.charAt(keyboardTable.indexOf(c) - 1);
                    }
            }
            System.out.println(new String(input));
        }while(sc.hasNext());
    }
}