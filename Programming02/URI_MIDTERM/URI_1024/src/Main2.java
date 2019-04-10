import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt(), n = 0, shift, i;         sc.nextLine();

        while(n++ < numOfTests){
            String input = sc.nextLine(), output = "";
            for(i = input.length() - 1; i >= 0; i--){
                shift = 0;
                if(i >= Math.ceil(input.length() / 2f)){
                    if(Character.isLetter(input.charAt(i)))
                        shift = 3;
                }
                else{
                    if(Character.isLetter(input.charAt(i)))
                        shift = 2;
                    else
                        shift = -1;
                }
                output = output.concat((char)((int)(input.charAt(i) + shift)) + "");
            }
            System.out.println(output);
        }
    }
}
/*  gi.r{hyz-xx

4
Texto #3
abcABC1
vxpdylY .ph
vv.xwfxo.fd

3# rvzgV
1FECedc
ks. \n{frzx
gi.r{hyz-xx
*/
