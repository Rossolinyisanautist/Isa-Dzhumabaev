
// COMPLETE AND TOTAL BULLSHIT
// SEE Main2 IS MUCH BETTER
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
                                                //INPUT
            int n = sc.nextInt();
            sc.nextLine();                                  // line skip preventing.
            String[] input = new String[n];
            int[] output = new int[n];                      // new array to store all inputs as numbers
                                                            // because it will be easier to sort them.
            for(int i = 0; i < n; i++){
                input[i] = sc.next();                       // get string input.
                output[i] = Integer.parseInt(input[i]);     // turn string-input into integer and put it in a new array
            }                                    //PROCESS
            for(int i = 0; i < output.length; i++){         // sorting algorithm.
                for(int j = i; j < output.length; j++){     // J starts from I because everything before I is already sorted.
                    if(output[i] > output[j]){              // take number J and number I and compare them  // J's values change faster
                        int temp = output[i];               // if J > I is true
                        output[i] = output[j];              // then swap J and I.
                        output[j] = temp;
                    }
                }
            }                                   //OUTPUT
            for(int i = 0; i < output.length; i++){
                int length = Integer.toString(output[i]).length();      // turn number into string and get its length.
                for(int j = 0; j < 4 - length; j++){                    // print (4 - length) number of zeros before actual number.
                    System.out.print(0);
                }
                System.out.println(output[i]);                          // print number itself.
            }
        }while(sc.hasNext());                                           // EOF check.
    }
}