import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("1st number?");
        int first = scan.nextInt();
        System.out.print("2nd number?");
        int second = scan.nextInt();
        //process, output
        if (first > second){
            System.out.printf("The first number (%f) is greater then second (%f)", first, second);
        }
        else if (first < second){
            System.out.printf("The second number (%f) is greater then first (%f)", second, first);
        }
        else
            System.out.printf("The first number (%f) equals to second (%f", first,second);
    }
}
