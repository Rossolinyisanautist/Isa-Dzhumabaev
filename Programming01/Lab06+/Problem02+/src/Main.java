import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        int numberOfDays = 30;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = isLeap(year) ? 29 : 28;
        }
        System.out.println("Number of days " + numberOfDays);
    }
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }
}
