import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month? ");
        int month = sc.nextInt();
        String season = "Invalid input";
        if(month >= 1 && month <= 2 || month == 12){
            season = "winter";
        }
        else if (month >= 3 && month <= 5){
            season = "spring";
        }
        else if(month >= 6 && month <= 8){
            season = "spring";
        }
        else if(month >= 9 && month <= 11){
            season = "fall";
        }
        System.out.println(season);
    }
}
