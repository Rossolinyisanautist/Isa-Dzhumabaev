import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class URI_1533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0) {break;}
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < n; i++){
                list.add(sc.nextInt());
            }
            ArrayList<Integer> sorted = new ArrayList<>(list);
            Collections.sort(sorted);
            System.out.println(list.indexOf(sorted.get(n - 2)) + 1);
        }
    }
}
