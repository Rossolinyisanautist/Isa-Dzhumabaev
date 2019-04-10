
// COMPLETE AND TOTAL BULLSHIT
// Main2 IS MUCH BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] input = sc.nextLine().toCharArray();
            char[] output = new char[input.length + getNewListLength(input)];
            boolean isItalics = false;
            boolean isBold = false;

            for(int i = 0, j = 0; i < input.length; i++, j++){
                if(input[i] == '_'){
                    if(isItalics){
                        output[j++] = '<';
                        output[j++] = '/';
                        output[j++] = 'i';
                        output[j] = '>';
                        isItalics = false;
                    }
                    else {
                        output[j++] = '<';
                        output[j++] ='i';
                        output[j] = '>';
                        isItalics = true;
                    }
                }
                else if(input[i] == '*'){
                    if(isBold){
                        output[j++] = '<';
                        output[j++] = '/';
                        output[j++] = 'b';
                        output[j] = '>';
                        isBold = false;
                    }
                    else {
                        output[j++] = '<';
                        output[j++] = 'b';
                        output[j] = '>';
                        isBold = true;
                    }
                }
                else{
                    output[j] = input[i];
                }
            }
            System.out.println(new String(output));
        }
    }
    static int getNewListLength(char[] list){
        int result = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] == '_' || list[i] == '*'){
                result++;
            }
        }
        return  (3 * result) + (result / 2);
    }
}
