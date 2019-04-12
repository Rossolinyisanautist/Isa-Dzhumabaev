import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y;
        while(true){
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            y = 1;
            while (true){
                if(remaining(n, y) != 11) {
                    y++;
                }
                else {
                    break;
                }
            }
            System.out.println(y);
        }
    }

    static int remaining(int n, int y) {
        int r = 0;
        for (int i = 1; i < n; i++){
            r = (r + y) % i;
        }
        return r;
    }

}
