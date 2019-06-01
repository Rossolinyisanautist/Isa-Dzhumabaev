import java.util.Scanner;

public class URI_1558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int number = sc.nextInt();
            int alpha = 0, beta = (int)Math.round(Math.sqrt(number));
            boolean isPossible = false;

            while(alpha <= beta){
                int sum = alpha * alpha + beta * beta;

                if(sum == number){
                    isPossible = true;
                    break;
                }
                else if(sum < number){
                    alpha++;
                }
                else if(sum > number){
                    beta--;
                }
            }
            System.out.println(isPossible ? "YES" : "NO");
        }while(sc.hasNext());
    }
}
