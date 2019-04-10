import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            char[] text = sc.next().toCharArray();
            char[] newText = new char[text.length];
            int step = sc.nextInt();
            for(int k = 0; k < text.length; k++){
                for(int j = 0; j < alphabet.length; j++){
                    if(text[k] == alphabet[j]){
                        int step2 = j + step;
                        while(step2 >= alphabet.length){
                            step2 -= alphabet.length;
                        }
                            newText[k] = alphabet[step2];
                    }
                }
            }
            for(int j = 0; j < newText.length; j++){
                System.out.print(newText[j]);
                if(j == newText.length - 1){
                    System.out.println();
                }
            }
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
