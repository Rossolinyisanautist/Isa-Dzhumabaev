import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{

            System.out.print("First rational: ");
            String first = sc.next();

            System.out.print("Operator: ");
            String operator = sc.next().toLowerCase();
            boolean compared = false;
            String comparisonResult = " = ";

            System.out.print("Second rational: ");
            String second = sc.next();

            Rational firstRational = Rational.parseRational(first);
            Rational secondRational = Rational.parseRational(second);

            switch (operator){
                case "+":
                    firstRational = firstRational.add(secondRational);
                    break;
                case "-":
                    firstRational = firstRational.subtract(secondRational);
                    break;
                case "*":
                    firstRational = firstRational.multiply(secondRational);
                    break;
                case "/":
                    firstRational = firstRational.divide(secondRational);
                    break;
                case "compare":
                    compared = true;
                    int temp = firstRational.compareTo(secondRational);
                    if(temp > 0){
                        comparisonResult = " > ";
                    }
                    else if(temp < 0){
                        comparisonResult = " < ";
                    }
            }

            firstRational = firstRational.simplify();
            if(compared){
                System.out.println(firstRational.toString() + comparisonResult + secondRational.toString());
            }
            else {
                System.out.println(firstRational.toString());
            }
        }while(sc.hasNext());
    }
}
