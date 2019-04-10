import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int points = scan.nextInt();
        if(points >= 0 && points <= 100){
            if(points >= 90){
                System.out.println("Grade: A");
            }
            else if(points >= 80){
                System.out.println("Grade: B");
            }
            else if(points >= 70){
                System.out.println("Grade: C");
            }
            else if(points >= 60){
                System.out.println("Grade: D");
            }

            else{
                System.out.println("Grade: F");
            }
        }
        else {
            System.err.println()
        }
    }
}


/*      90 <= A <= 100
        80 <= B < 90
        70 <= C < 80

        60 <= D < 70
        Below 60: F*/
