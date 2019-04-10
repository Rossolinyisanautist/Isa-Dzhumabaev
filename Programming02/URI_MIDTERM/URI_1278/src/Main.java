import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLength, i, n = sc.nextInt();

        while(true){
            sc.nextLine();
            maxLength = i = 0;
            String[] text = new String[n];

            while(i < text.length){
                text[i] = sc.nextLine().trim().replaceAll("( )+", " ");
                maxLength = text[i].length() > maxLength ? text[i].length() : maxLength;
                i++; }

            for(String line : text)
                System.out.printf(("%" + maxLength + "s%n"), line.replaceAll(" +$", ""));

            if((n = sc.nextInt()) == 0)
                break;
            System.out.println();
        }
    }
}/*
3
     ROMEO      AND
      JULIET WERE
        IN LOVE
4
WHO
ELSE
LOVES
STAIRS
3
A TEXT CAN BE JUSTIFIED
ON   BOTH   SIDES    OR
JUST   TO   THE   RIGHT
0
*/