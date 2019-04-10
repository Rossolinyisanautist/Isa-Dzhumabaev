// BULLSHIT Main2 IS BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] D = sc.next().toCharArray();
        String input = sc.next();
        char[] N = input.toCharArray();

        while((D[0] != '0' && N.length > 1) || (N[0] != '0' || N.length > 1)){
            // TODO: get rid of D's
            for(int i = 0; i < N.length; i++){
                if(D[0] == N[i]){
                    N[i] = '.';
                }
            }
            // TODO: get rid of zeros
            for(int i = 0; i < N.length; i++){
                if(N[i] == '0' || N[i] == '.'){
                    N[i] = ',';
                }
                else {
                    break;
                }
            }
            int j = 0;
            char[] newN = new String(N).toCharArray();
            for(int i = 0; i < newN.length; i++){
                if(newN[i] != '.' && newN[i] != ','){
                    System.out.print(newN[i]);
                }
                else {
                    j++;
                }
            }
            // TODO: if D = N -> output -> 0
            if(j == newN.length){
                System.out.println('0');
            }
            else{
                System.out.println();
            }
            D = sc.next().toCharArray();
            input = sc.next();
            N = input.toCharArray();
        }
    }
}
/*

5 5000000
3 123456
9 23454324543423
9 99999999991999999
7 777
0 0
*/
