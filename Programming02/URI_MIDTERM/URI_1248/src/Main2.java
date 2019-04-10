
// This code counts limit = L for each food and if food was
// ate less than L times then prints this food (L - T) times.
// Where T is how many times this food was ate.
// 50% Wrong Answer at URI

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String food = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";                 // All possible types of food.
        int n = sc.nextInt();   sc.nextLine();                      // Get N and call nextLine() to prevent
        // errors in future nextLine() calls.
        int c = 0;
        while (c < n) {
            int[] count = new int[food.length()];                   // nextLine() is used so it's possible to get an empty strings.
            int[] foodLimit = new int[food.length()];               // To count limit for each type of food.
            boolean[] isInDiet = new boolean[food.length()];        // To check if food is in diet or not.
            boolean isCheater = false;                              // To not print output array in the end.
            char[] diet = sc.nextLine().toCharArray();              // Get DIET and turn it to char array
                                                                    // because it'll be easier to get chars in future.

            char[] eaten = sc.nextLine().                           // Get BREAKFAST and
                   concat(sc.nextLine()).                           // concat it with LUNCH, then turn it to char array
                   toCharArray();                                   // because it'll be easier to get chars from it.

            for (char i : diet) {                                   // Preparations for future checks,
                isInDiet[food.indexOf(i)] = true;                   // we'll check if food is in DIET and is eaten more.
                foodLimit[food.indexOf(i)]++;                       // than one times or is not in diet, but was eaten.
            }                                                       // If food is in diet then limit is increased by 1.
            for (char i : eaten)
                count[food.indexOf(i)] += 1;                        // Count how many times each food was eaten.
            char[] output = new char[food.length()];                // To save not eaten food.

            for (int i = 0; i < count.length; i++) {                        // Go through alphabet to output foods in alphabetic order.
                if (isInDiet[i]) {                                          // If food is in diet and
                    if (count[i] < foodLimit[i])                            // was ate less then it is necessary
                        for(int k = 0; k < foodLimit[i] - count[i]; k++)    // then, saves this food (L - T) times. Where L is
                            output[i + k] = food.charAt(i);                 // a limit and T is how many times this food was ate.

                    else if (count[i] > foodLimit[i]) {             // But if food is in diet, but was was ate more times
                        System.out.println("CHEATER");              // than it is allowed then print CHEATER and stop output.
                        isCheater = true;                           // To not print output array in the end.
                        break; }
                }
                else if (count[i] > 0) {                            // Else food is not in diet,
                    System.out.println("CHEATER");                  // but was eaten
                    isCheater = true;                               // then print CHEATER
                    break; }                                        // and stop output.
            }
            if(!isCheater)
                System.out.println(new String(output));
            c++;
        }
    }
}/*
INPUTS TO BE CHECKED

15
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
ABCEED
ABC

ABCEED
ABCE


*/