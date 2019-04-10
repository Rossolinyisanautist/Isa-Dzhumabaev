import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        String lvl = "Invalid input";
        switch (inp){
            case 0:
                lvl = "a total newbie";
                break;
            case 1:
                lvl = "a beginner";
                break;
            case 2:
            case 3:
                lvl = "an experienced gamer";
                break;
            case 4:
            case 5:
                lvl = "a pro gamer";
                break;
        }
        if (lvl.equals("Invalid input"))
                System.out.println(lvl);
        else
                System.out.println("You are " + lvl);

    }
}
