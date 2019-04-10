import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            boolean isItalics = false, isBold = false;
            String input = sc.nextLine(), output = "";

            for(char c : input.toCharArray()){

                if(c == '_'){
                    output = isItalics ? output.concat("</i>") : output.concat("<i>");
                    isItalics = !isItalics; }

                else if(c == '*'){
                    output = isBold ? output.concat("</b>") : output.concat("<b>");
                    isBold = !isBold; }

                else
                    output = output.concat(c + "");
            }
            System.out.println(output);
        }
    }
}/*

You _should_ see the new walrus at the zoo!
Move it from *Accounts Payable* to *Receiving*.
I saw _Chelydra serpentina_ in *Centennial Park*.
_ _ __ _ yabba dabba _ * dooooo * ****
_now_I_know_*my*_ABC_next_time_*sing*it_with_me

*/