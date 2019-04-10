import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sum;
        int m, n;
        while(true){
            m = sc.nextInt(); n = sc.nextInt();
            if(m == 0 && n == 0)
                break;
            sum = Integer.toString(m + n).replaceAll("0", "");
            System.out.println(sum);

        }
    }
}
