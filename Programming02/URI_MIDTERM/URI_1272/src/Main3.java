import java.util.Scanner;

public class Main3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String input = sc.nextLine().trim().replaceAll("( )+", " ");
            String[] parts = input.split(" ");
            for(String i : parts)
                if(i.length() > 0)
                    System.out.print(i.charAt(0));
            System.out.println();
        }
    }
}/*
4
round  elimination during  onsite  contest

*/