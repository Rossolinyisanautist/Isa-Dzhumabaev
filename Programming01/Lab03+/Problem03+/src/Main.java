import java.util.*;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("First number? ");
        int first = scan.nextInt();
        System.out.print("Second number? ");
        int second = scan.nextInt();
        System.out.print("Third number? ");
        int third = scan.nextInt();
        if (first != second && first != third && second != third){
            int max = Math.max(Math.max(first,second),third);
            System.out.println("The value "+max+" is the greatest one.");}
         else
             System.out.println("All values are equal to each other");
    }
}
