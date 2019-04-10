import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int N = sc.nextInt(), numberOfOperations, firstIndex, secondIndex, i;
        char[] start, goal;
        sc.nextLine();

        while(N-- > 0){
            start = sc.next().toCharArray();
            goal = sc.next().toCharArray();
            numberOfOperations = 0;

            for(i = 0; i < start.length; i++)
                if(start[i] != goal[i]){
                    firstIndex = alphabet.indexOf(start[i]);
                    secondIndex = alphabet.indexOf(goal[i]);
                    numberOfOperations += (firstIndex < secondIndex) ? secondIndex - firstIndex
                                                                     : 26 - (firstIndex - secondIndex);
                }
            System.out.println(numberOfOperations);
        }
    }
}/*
3
ab bd
abc abc
abcdefghiz aaaaaaaaaa

*/