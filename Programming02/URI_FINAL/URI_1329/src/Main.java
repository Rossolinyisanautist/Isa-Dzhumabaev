import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n == 0)
                break;

            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < n; i++){
                int input = sc.nextInt();
                if(input == 0)
                    count1++;
                if(input == 1)
                    count2++;
            }
            System.out.printf("Mary won %d times and John won %d times%n", count1, count2);
        }
    }
}
