import java.util.Scanner;

public class URI_1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(sc.nextInt() % 6 == 0 ? "Y" : "N");
        }while(sc.hasNext());
    }
}
/*

0
3
6
9

*/
