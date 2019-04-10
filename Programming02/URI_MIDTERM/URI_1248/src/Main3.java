import java.util.Scanner;
// WRONG ANSWER 5%

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";                 // All possible types of food.
        int n = sc.nextInt();   sc.nextLine();                      // Get N and call nextLine() to prevent
        // errors in future nextLine() calls.
        while (n-- > 0) {
            int[] count = new int[food.length()];                   // nextLine() is used so it's possible to get an empty strings.
            boolean[] isInDiet = new boolean[food.length()];        // To check if food is in diet or not.
            char[] diet = sc.nextLine().toCharArray();              // Get DIET and turn it to char array
                                                                    // because it'll be easier to get chars in future.
            char[] eaten = sc.nextLine()                            // Get BREAKFAST and
                    .concat(sc.nextLine())                          // concat it with LUNCH, then turn it to char array
                    .toCharArray();                                 // because it'll be easier to get chars from it.

            for (char i : diet)                                     // Preparations for future checks,
                isInDiet[food.indexOf(i)] = true;                   // we'll check if food is in DIET and is eaten more
            for (char i : eaten)                                    // than one time or is not in diet, but was eaten.
                count[food.indexOf(i)] += 1;                        // Count how many times each food was eaten.

            int i = 0;
            while(i < count.length) {                               // Weill go through alphabet to output foods in alphabetic order.
                if (isInDiet[i]) {                                  // If food is in died and was
                    if (count[i] < 1)                               // not eaten, print this food
                        System.out.print(food.charAt(i));           // then print this food.
                    else if (count[i] > 1) {                        // But if food is in diet, but was
                        System.out.print("CHEATER");                // eaten more then 1 time then
                        break; }                                    // print CHEATER and stop output.
                }
                else                                                // Else food is not in diet,
                    if (count[i] > 0) {                             // but was eaten
                        System.out.print("CHEATER");                // then print CHEATER
                        break;}                                     // and stop output.
                i++;
            }
            System.out.println();
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
