import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int FirstNum, SecondNum;
        System.out.print("Enter 1st number: ");
        FirstNum = input.nextInt();

        System.out.print("Enter 2nd number: ");
        SecondNum = input.nextInt();

        int A=FirstNum, B=SecondNum;

        int     plus = A+B,
                minus = A-B,
                devide = A/B,
                multiply = A*B,
                remainder = A%B;

        System.out.println(
                A+" + "+B+" = "+plus+"\n"+
                A+" - "+B+" = "+minus+"\n"+
                A+" / "+B+" = "+devide+"\n"+
                A+" * "+B+" = "+multiply+"\n"+
                A+" % "+B+" = "+remainder);
    }
}
