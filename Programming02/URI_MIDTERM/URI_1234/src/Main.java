import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char[] input = sc.nextLine().toCharArray();

            for(int i = 0, j = 0; i < input.length; i++, j++){
                if(Character.isLetter(input[i]))
                    input[i] = j % 2 == 0 ? Character.toUpperCase(input[i]) : Character.toLowerCase(input[i]);
                else
                    j++;
            }
            System.out.println(new String(input));
        }
    }
}
/*

This  is a dancing sentence
  This   is         a  dancing   sentence
aaaaaaaaaaa
z

*/
