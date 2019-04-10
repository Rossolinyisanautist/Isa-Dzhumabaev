import java.util.Scanner;
// URI_2747
public class Main3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 39;
        while(n-- > 0)
            System.out.print("-");
        for(n = 0; n < 5; n++)
            System.out.printf("%n%s%38s", "|", "|");
        n = 39;
        while(n-- > 0)
            System.out.print(n == 38 ? "\n-" : "-");
        System.out.println();
    }
}