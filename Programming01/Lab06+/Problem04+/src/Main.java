import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers only!\nA = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int gcd = 2;
        try {gcd = GCD(a, b);
            System.out.println("GCD(" + a + ", " + b + ") = " + gcd);
        }
        catch(IllegalArgumentException a_and_b_are_zeros){
            System.out.println("GCD(0, 0) is not defined");
//            System.exit(-1);
        }

    }
    public static int GCD(int a, int b){
        int gcd = 1;
        if (a == 0 && b == 0){
            throw new IllegalArgumentException();
        }
        else{
            int limit = (Math.abs(a) >= Math.abs(b)) ? Math.abs(a) : Math.abs(b);
            for(int i = 2; i <= limit; i++){
                if(a % i == 0 && b % i == 0){
                    gcd = i;
                }
            }
        }
    return gcd;}
}
