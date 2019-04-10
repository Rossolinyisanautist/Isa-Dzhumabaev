// BULLSHIT SOLUTION

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();                      // prevent empty strings in further inputs
                                            //
        String tempInput;                   // temporary variable for input
        tempInput = sc.nextLine();
        String[] input = tempInput.split(" ");
        char[][] output = new char[n][];                // create new array that will be modified in future

        for(int i = 0; i < input.length; i++){          // fill array with Input strings
            output[i] = input[i].toCharArray();
        }

        for(int i = 0; i < input.length; i++){
            if(input[i].length() == 3){         // we will initiate a loop if and
                for(int j = 0; j < 3; j++){     // only if this string's length is 3
                    if(input[i].charAt(0) == 'U' && input[i].charAt(1) == 'R' ||    // case for URI
                       input[i].charAt(0) == 'O' && input[i].charAt(1) == 'B' ){    // case for OBI
                        output[i][2] = 'I';
                    }
                }
            }
        }
        // OUTPUT
        // After using split() we removed all whitespaces and now have to print them manually
        for(int i = 0; i < output.length; i++){
            if(i == output.length - 1){                     // if we reached last string then program
                System.out.println(new String(output[i]));  // will not print whitespace after it
            }
            else{
                System.out.print(new String(output[i]) + " ");  // else we print whitespace to separate strings
            }
        }
    }
}
