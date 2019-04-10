import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int playTime = end - start;

        if (start >= end){
            playTime = 24 - Math.abs(playTime);
        }
        System.out.println("O JOGO DUROU "+playTime+" HORA(S)");
    }
}
