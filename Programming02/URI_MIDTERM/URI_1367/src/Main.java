import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IDs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", id;
        int n, i, time, corrects, totalTime;
        int[] extraTime;

        while(true){
            n = sc.nextInt();
            corrects = totalTime = i = 0;
            extraTime = new int[IDs.length()];

            while(i < n){

                id = sc.next();
                time = sc.nextInt();

                if(sc.next().equals("correct")){
                    corrects++;
                    totalTime += time;
                    totalTime += extraTime[IDs.indexOf(id)];
                } else
                    extraTime[IDs.indexOf(id)] += 20;
                i++;
            }
            if(n == 0)
                break;
            System.out.printf("%d %d%n", corrects, totalTime);
        }
    }
}
/*

*/
