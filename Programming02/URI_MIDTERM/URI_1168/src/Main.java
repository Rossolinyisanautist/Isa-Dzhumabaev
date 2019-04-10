import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numberOfTests = sc.nextInt();

        for(int N = 0; N <= numberOfTests; N++){
            String numberToCheck = sc.nextLine();
            int numberOfLeds = method(numberToCheck);
            if(N != 0){
                System.out.println(numberOfLeds + " leds");}
        }
    }

    public static int method(String number){
        int numberOfLeds = 0, i = 0;
        for(; i < number.length(); i++){
            switch (number.charAt(i)){
                case '2':
                case '3':
                case '5':
                    numberOfLeds += 5;
                    break;
                case '0':
                case '6':
                case '9':
                    numberOfLeds += 6;
                    break;
                case '1':
                    numberOfLeds += 2;
                    break;
                case '4':
                    numberOfLeds += 4;
                    break;
                case '7':
                    numberOfLeds += 3;
                    break;
                case '8':
                    numberOfLeds += 7;
                    break;
            }
        }
        return numberOfLeds;
    }
}
