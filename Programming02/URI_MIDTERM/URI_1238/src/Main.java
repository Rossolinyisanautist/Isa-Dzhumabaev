import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] combinedText;
        int N = sc.nextInt();
        while(N-- > 0){
            String first = sc.next(), second = sc.next();

            combinedText = new char[first.length() + second.length()];
            boolean isFirstLengthGreater = first.length() > second.length();

            int bound = isFirstLengthGreater ? second.length() :first.length();

            for(int i = 0, j = 0; j < first.length() && i < combinedText.length; i += 2, j++){
                combinedText[i] = first.charAt(j);
            }

            for(int i = 1, j = 0; j < second.length() && i < combinedText.length; i += 2, j++){
                combinedText[i] = second.charAt(j);
            }
            for(int i = bound * 2, j = bound; i < combinedText.length; i++, j++){
                combinedText[i] = isFirstLengthGreater ? first.charAt(j) : second.charAt(j);
            }
            System.out.println(new String(combinedText));
        }
    }
}
