import java.util.Scanner;

// use EOF - End Of File

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Year: ");
            if(!sc.hasNext()){
                break;
            }
            int year = sc.nextInt();
            System.out.print("Month: ");
            if(!sc.hasNext()){
                break;
            }
            int month = sc.nextInt();
            int toPrint = getDaysInMonth(year, month);
            if (toPrint != -1) {
                System.out.println("Days: "  + toPrint);
            }else{
                System.err.println("Invalid month number");
            }
        }while(true);
    }
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    public static int getDaysInMonth(int year, int month){
        int[] list = {31,28,31,30,31,30,31,31,30,31,30,31}; // length = 12
        int toReturn;
        if(month >= 1 && month <= 12){
            if(isLeap(year)){
                list[1] = 29;}
            toReturn = list[month - 1];
        }
        else{
            toReturn = -1;
        }
    return toReturn; }
}
