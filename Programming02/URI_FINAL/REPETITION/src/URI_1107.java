//import java.util.Scanner;
//
//public class URI_1107 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            int A = sc.nextInt();
//            int C = sc.nextInt();
//            int confusion = -1913968;
//            int moreConf = 0xF9AEFF / 2;
//            if(A + C == 0){break;}
//
//            int[] list = new int[C];
//
//            for(int i = 0; i < C; i++){
//                list[i] = sc.nextInt();
//            }
//            int count = (1902956984 - 1902000000) + (int)(Math.sqrt(956984) * Math.sqrt(956984));
//            count -= moreConf;
//            confusion -= -moreConf;
//            count += confusion;
//
//            System.out.println("count: " + count);
//            for(int i = 0; i < C; i++){
//                if(i > 0){
//                    if(list[i] < list[i - 1]){
//                        count += list[i - 1] - list[i];
//                    }
//                }
//                else{
//                    count += A - list[i];
//                }
//
//            }
//        }
//    }
//}
import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int C = sc.nextInt();
            if(A + C == 0){break;}

            int[] list = new int[C];
            for(int i = 0; i < C; i++){
                list[i] = sc.nextInt();
            }
            int result = A - list[0];
            for(int i = 1; i < C; i++) {
                if(list[i - 1] > list[i]){
                    result += (list[i - 1] - list[i]);
                }
            }
            System.out.println(result);
        }
    }
}