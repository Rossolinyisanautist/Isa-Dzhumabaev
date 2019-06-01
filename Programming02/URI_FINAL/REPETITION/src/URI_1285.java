import java.util.*;

public class URI_1285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            int N = sc.nextInt(),
                M = sc.nextInt(),
                count = 0;

            for(int i = N; i <= M; i++ ){
                if(hasDistinctDigits(i)){
                    count++;
                }
            }
            System.out.println(count);
        }while(sc.hasNextInt());
    }

    private static boolean hasDistinctDigits(int i) {
        StringBuilder number = new StringBuilder();
        for(char c : (i + "").toCharArray()){
            String digit = c + "";

            if(number.indexOf(digit) >= 0){
                return false;
            }
            number.append(digit);
        }
        return true;
    }

    boolean checkDigits(int num){
        StringBuilder num2 = new StringBuilder();
        for(char c : (num + "").toCharArray()){
            String digit = c + "";

            if(num2.indexOf(digit) >= 0){
                return false;
            }
            num2.append(digit);
        }
    return true;}
}































