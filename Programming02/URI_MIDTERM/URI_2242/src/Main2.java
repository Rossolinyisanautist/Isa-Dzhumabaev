import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiou", input = sc.next(), temp = "";
        int half, i;

        for(char c: input.toCharArray())
            if(vowels.contains(c + ""))
                temp = temp.concat(c + "");

        half = temp.length() / 2;
        i = temp.length() % 2 == 0 ? 0 : 1;

        input = new StringBuilder(temp.substring(half + i)).reverse().toString();
        temp = temp.substring(0, half);

        System.out.println(temp.equals(input) ? "S" : "N");
    }
}/*
hahaha
hahahaha
riajkjdhhihhjak
riajkjdhhahhjik
a
huaauhahhuahau

*/