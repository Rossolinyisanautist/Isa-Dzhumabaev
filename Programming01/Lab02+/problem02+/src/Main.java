import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner (System.in);
//        System.out.print("1st value: ");
        int a = 2;
//        System.out.print("2nd value: ");
        int b = 3;

        System.out.printf("Before swapping: a = %d; b = %d;%n", a, b);

        //TODO: Swap values of a and b

        a = a^b; // A(2) belongs to B(3) is true then A = A+B. Which means perform addition if true.
        b = a^b; //A(which is now 5) belongs to B(3) is false then B = A-B. Which means perform subtraction if false.
        a = a^b; //A(5) belongs to B(which is now 2) is false then A = A-B. Which means perform subtraction if false.

        System.out.printf("After swapping: a = %d; b = %d;%n", a, b);

    }
}
