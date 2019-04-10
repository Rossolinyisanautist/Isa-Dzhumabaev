// SOLVED
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   sc.nextLine();

        while (n-- > 0) {
            // TODO: INPUT
            String diet = sc.nextLine(), dinner = "";
            char[] eaten = sc.nextLine()
                           .concat(sc.nextLine())
                           .toCharArray();
            // TODO: PROCESS
            boolean isCheater = false;
            int[] counter = new int[diet.length()];

            for (char i : eaten ){
                if(!diet.contains(Character.toString(i))){
                    isCheater = true;
                    break; }
                counter[diet.indexOf(i)] += 1;
            }
            int i = 0;
            while(i < counter.length && !isCheater) {
                if (counter[i] < 1)
                    dinner = dinner.concat(Character.toString((diet.charAt(i))));
                else if (counter[i] > 1)
                    isCheater = true;
                i++;
            }
            // TODO: OUTPUT
            if(!isCheater){
                eaten = dinner.toCharArray();
                Arrays.sort(eaten);
                System.out.println(new String(eaten)); }
            else
                System.out.println("CHEATER");
        }
    }
}
/*
INPUTS TO BE CHECKED

12
ABEDC
AB
CD
ABEDC
A
B
ABEDC
AB
BC
ABCD
AB
C
ABEDCS


EDSMB
MSD
A



IWANTSODER
SOW
RAT
QWERTACEBD
QRWDA

ABCDE

AB

A
B
ABCEXXX
ABC
X

*/