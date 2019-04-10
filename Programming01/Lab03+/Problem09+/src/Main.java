import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int computer = (int)(Math.random()*2);
        switch(userInput){
            case 0:
                switch(computer){
                    case 0:
                        System.out.println("Computer is scissors. You are too. It is a draw");
                        break;
                    case 1:
                        System.out.println("Computer is rock. You are scissors. You lose");
                        break;
                    case 2:
                        System.out.println("Computer is paper. You are scissors. You win");
                        break;}
                break;
            case 1:
                switch(computer){
                case 0:
                    System.out.println("Computer is scissors. You are rock. You win");
                    break;
                case 1:
                    System.out.println("Computer is rock. You are too. It is a draw");
                    break;
                case 2:
                    System.out.println("Computer is paper. You are rock. You lose");
                    break;}
                break;
            case 2:
                switch(computer){
                case 0:
                    System.out.println("Computer is scissors. You are paper. You lose");
                    break;
                case 1:
                    System.out.println("Computer is rock. You are paper. You win");
                    break;
                case 2:
                    System.out.println("Computer is paper. You are too. It is draw");
                    break;}
                break;
        }
    }
}