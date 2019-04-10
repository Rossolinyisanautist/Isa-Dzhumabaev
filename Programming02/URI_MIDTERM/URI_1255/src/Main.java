
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz", input;
        int[] counter;
        int n = sc.nextInt(), max;
        sc.nextLine();

        while(n-- > 0){
            input = sc.nextLine().toLowerCase();
            counter = new int[alphabet.length()];
            max = counter[0];

            for(char c : input.toCharArray())
                if(Character.isAlphabetic(c))
                    counter[alphabet.indexOf(c)]++;

            for(int i : counter)
                if(i > max)
                    max = i;

            for(int i = 0; i < counter.length; i++)
                if(counter[i] >= max)
                    System.out.print(alphabet.charAt(i));
            System.out.println();
        }
    }
}/*
3
Computers account for only 5% of the country's commercial electricity consumption.
Input
frequency letters

*/