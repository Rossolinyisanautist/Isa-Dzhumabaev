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
        }
    }
    public static int GCD(int a, int b){
        int gcd;
        if (a == 0 && b == 0){
            throw new IllegalArgumentException();
        }
        else{
            do{
                int times = (a > b) ? (a / b) : (b / a);
                if(a > b)
                    a -= times*b;
                else
                    b -= times*a;
                gcd = a > b ? a : b;
            }while(a != 0 && b !=0);
        }
        return gcd;}
}