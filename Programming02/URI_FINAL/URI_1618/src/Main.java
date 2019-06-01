import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int Ax = sc.nextInt(),
                Ay = sc.nextInt(),
                Bx = sc.nextInt(),
                By = sc.nextInt(),
                Cx = sc.nextInt(),
                Cy = sc.nextInt(),
                Dx = sc.nextInt() ,
                Dy = sc.nextInt(),
                Rx = sc.nextInt(),
                Ry = sc.nextInt();
            if(Rx >= Ax && Rx <= Bx && Rx <= Cx && Rx >= Dx && Ry >= Ay && Ry >= By && Ry <= Cy && Ry <= Dy){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}