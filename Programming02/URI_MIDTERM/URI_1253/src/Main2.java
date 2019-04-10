import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            char[] text = sc.next().toCharArray();
            char[] newText = new char[text.length];
            int step = sc.nextInt();

            for(int k = 0; k < text.length; k++){
                int shift = alphabet.indexOf(text[k]) - step;
                while(shift < 0)
                    shift += alphabet.length();
                newText[k] = alphabet.charAt(shift);
            }
            System.out.println(new String(newText));
        }
    }
}
/*

6
VQREQFGT
2
ABCDEFGHIJKLMNOPQRSTUVWXYZ
10
TOPCODER
0
ZWBGLZ
25
DBNPCBQ
1
LIPPSASVPH
4

*/
