import java.util.*;

public class Main {
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
        String number = "";
        StringBuilder sb = new StringBuilder();

        for(char d : (i + "").toCharArray()){

            if(!number.contains(d + "")){
                sb.append(d);
                number = sb.toString();
            }
        }
    return i == Integer.parseInt(number);}
}
/*
87 104
989 1022
22 25
1234 1234

*/
