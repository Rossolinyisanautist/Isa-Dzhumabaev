import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int first = 0;
        int last = input.length() - 1;

        boolean isPalindrome = true;
        for(; first < last; first++, last--){
            if(input.charAt(first) != input.charAt(last)){
                isPalindrome  = false;
            }
        }
        if (isPalindrome)
            System.out.println(input + " is a palindrome");
        else
            System.out.println(input + " is not a palindrome");
    }
}
