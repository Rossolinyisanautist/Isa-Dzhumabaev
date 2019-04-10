import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            char[] word = sc.next().toCharArray();
            for(int i = 0; i < word.length; i++){
                String output = "";

                for(int j = 0; j < word.length - i; j++){
                    output = output.concat(Character.toString(word[j]));

                    if(j < word.length - i - 1)
                        output = output.concat(" ");
                }
                String formatCommand = "%" + (output.length() + i) + "s%n";
                System.out.printf(formatCommand, output);
            }
            System.out.println();
        }while (sc.hasNext());
    }
}
/*
ABRACADABRA
HELPME
DIO
*/