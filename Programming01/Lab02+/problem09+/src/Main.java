import java.util.Scanner;
public class Main {
    public static void main(String[] arhs){
        Scanner inp = new Scanner (System.in);
        System.out.print("Enter number of minuts: ");

        int mins = inp.nextInt();
        int years = mins/60/24/365;
        int days = (mins-years*60*24*365)/60/24;

        System.out.println(years);
        System.out.println(days);

    }
}
