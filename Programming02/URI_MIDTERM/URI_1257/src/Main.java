import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i, hash, element, numOfWords;
        char[] input;
        while(n-- > 0){
            hash = element = 0;
            numOfWords = sc.nextInt();

            while(element < numOfWords){
                input = sc.next().toCharArray();

                for(i = 0; i < input.length; i++){
                    hash += alphabet.indexOf(input[i]);
                    hash += element;
                    hash += i;
                }
                element++;
            }
            System.out.println(hash);
        }
    }
}/*
5
2
CBA
DDD
1
Z
6
A
B
C
D
E
F
6
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXYZ
1
ZZZZZZZZZZ

*/