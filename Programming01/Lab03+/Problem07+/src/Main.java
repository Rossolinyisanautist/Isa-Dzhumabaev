import java.util.Scanner;

public class Main {
    public static String defineDayOfTheWeek(int day){
        String newDayOfWeek = "";
        for (;day > 7;){
            day -= 7;
        }switch (day){
            case 0:
                newDayOfWeek = "Sunday";
                break;
            case 1:
                newDayOfWeek = "Monday";
                break;
            case 2:
                newDayOfWeek = "Tuesday";
                break;
            case 3:
                newDayOfWeek = "Wednesday";
                break;
            case 4:
                newDayOfWeek = "Thursday";
                break;
            case 5:
                newDayOfWeek = "Friday";
                break;
            case 6:
                newDayOfWeek = "Saturday";
                break;
        }
    return newDayOfWeek;}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysAfter = sc.nextInt();
        int newday = day + daysAfter;
        String oldDayOfWeek = defineDayOfTheWeek(day);
        String newDayOfWeek = defineDayOfTheWeek(newday);
        System.out.println("Today is "+oldDayOfWeek+" and the future day is "+newDayOfWeek);
    }
}