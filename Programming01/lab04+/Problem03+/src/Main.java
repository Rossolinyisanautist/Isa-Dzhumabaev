import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Month? ");
        int month = sc.nextInt();
        String season = "Invalid input";
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "spring";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
        }
        System.out.println(season);
    }
}
