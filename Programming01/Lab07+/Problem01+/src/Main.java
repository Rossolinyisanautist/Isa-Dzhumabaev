import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int numberOfToss = sc.nextInt();
        int[] list = new int[11];
        for(int j = 0; j < numberOfToss; j++){
            int die1 = (int)(1 + (Math.random() * 6));
            int die2 = (int)(1 + (Math.random() * 6));
            int randomNumber = die1 + die2;
            ++list[randomNumber - 2];
        }
        for(int i = 0; i < list.length; i++){
            System.out.println(i + 2 + ": " + list[i]);
        }
//        System.out.println(Arrays.toString(list));
    }
}
