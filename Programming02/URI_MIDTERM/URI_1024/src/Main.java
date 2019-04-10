import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfIterations = sc.nextInt();
        sc.nextLine();
        for(int n = 0; n < numberOfIterations; n++){
            String inputText = sc.nextLine();
            char[] outputText = new char[inputText.length()];
            int halfLength = (int)(outputText.length / 2.0);
            // TODO: Shift 3 positions to right
            for(int i = 0; i < outputText.length; i++){
                if(Character.isLetter(inputText.charAt(i))){
                    outputText[i] = (char)((int)inputText.charAt(i) + 3);
                }
                else{
                    outputText[i] = inputText.charAt(i);}
            }
            // TODO: Reverse
            for(int first = 0; first < halfLength; first++){
                int last = outputText.length - first - 1;
                char temp = outputText[first];
                outputText[first] = outputText[last];
                outputText[last] = temp;
            }
            // TODO: Shift 1 positions to left
            for(int i = halfLength; i < inputText.length(); i++){
                    outputText[i] = (char)((int)outputText[i] - 1);
            }
            System.out.println(new String(outputText));
        }
    }
}
/*  089640a
4
Texto #3
abcABC1
vxpdylY .ph
vv.xwfxo.fd

*/
