
// BULLSHIT Main2 IS MUCH BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S,
            M;
        do{
            S = sc.nextInt();
            M = sc.nextInt();
            int numberOfZeros = 0;
            char[] sum = Integer.toString(S + M).toCharArray();
            for(int i = 0; i < sum.length; i++){
                if(sum[i] == '0'){
                    numberOfZeros++;
                }
            }
            char[] result = new char[sum.length - numberOfZeros];
            for(int i = 0, j = 0; i < sum.length; i++){
                if(sum[i] != '0'){
                    result[j] = sum[i];
                    j++;
                }
            }
            if(S + M != 0)
                System.out.println(new String(result));
        }while(S != 0 && M != 0);
        /*
        GET INPUT

        GET SUM

        TURN TO CHAR ARRAY

        REPLACE ALL ZEROS WITH WHITESPACE

        OUTPUT (if element != ' ')
        */
    }
}/*
7 8
15 5
99 6

*/