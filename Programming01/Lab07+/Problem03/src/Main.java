import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Enter " + i + " element: ");
            list[i] = sc.nextInt();
        }
        System.out.println("Before reversing: \n" + Arrays.toString(list));
        for(int i = 0, j = N - 1; i < list.length/2; i++, j--){
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        System.out.println("After reversing: \n" + Arrays.toString(list));
    }
}
