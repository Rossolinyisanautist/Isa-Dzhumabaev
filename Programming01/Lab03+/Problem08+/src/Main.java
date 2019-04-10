import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++){
            list[i] = sc.nextInt();
        }
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length;){
            if (list[i] >= list[j]){
                j++;
            }else{
                int tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
            } }
        }
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
