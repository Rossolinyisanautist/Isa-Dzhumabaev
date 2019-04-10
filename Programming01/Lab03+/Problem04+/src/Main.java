import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scan.nextInt();
        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("This is a leap year.");
        }
        else
            System.out.println("This is not a leap year.");

    }
}


//1796, 1804, 1896, 1904, 1992, 1996, 2000, 2004, 2008

//1799, 1800, 1801, 1802, 1803, 1805, 1899, 1900, 1901