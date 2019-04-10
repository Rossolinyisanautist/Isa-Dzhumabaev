import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        double start = scan.nextInt();
        double startMinutes = scan.nextInt();
        double end = scan.nextInt();
        double endMinutes = scan.nextInt();

        start = start*60 + startMinutes;
        end = end*60 + endMinutes;

        double playTimeInMinutes = (start - end);

        if (start >= end){
            playTimeInMinutes = 24*60 - Math.abs(playTimeInMinutes);
        }

        int playTimeInHours = (int)playTimeInMinutes / 60;
        playTimeInMinutes = playTimeInMinutes % 60;
        System.out.println("O JOGO DUROU "+Math.abs(playTimeInHours)+" HORA(S) E "+(int)Math.abs(playTimeInMinutes)+" MINUTO(S)");
    }
}
