import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double FirstNum, SecondNum;
        System.out.print("Enter 1st number: ");
        FirstNum = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        SecondNum = input.nextDouble();

        double A=FirstNum, B=SecondNum;

        double  plus = A+B,
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
