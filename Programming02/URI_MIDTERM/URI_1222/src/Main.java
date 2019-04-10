import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            sc.nextInt();
            int maxLinesPerPage, maxCharsPerLine, lines = 1, i = 0;
            maxLinesPerPage = sc.nextInt();
            maxCharsPerLine = sc.nextInt();
            sc.nextLine();

            String[] input = sc.nextLine().split(" ");
            String currentLine = "";

            while(i < input.length){
                currentLine = currentLine.concat(input[i]);
                if(currentLine.length() <= maxCharsPerLine)
                    currentLine = currentLine + " ";
                else {
                    currentLine = input[i] + " ";
                    lines++;
                }
                i++;
            }
            System.out.println((int)Math.ceil(lines / (float)maxLinesPerPage));
        }while(sc.hasNext());
    }
}
/*
8 4 3
a no lol and i de goo for

9 4 3
i no lol and i de goo fo r

8 2 2
a de ij de on o de a

14 4 20
Se mana Piedade tem casado com Quincas Borba apenas me daria uma esperanca colateral

Se mana Piedade tem
casado com Quincas
Borba apenas me
daria uma esperanca
colateral

16 3 30
No dia seguinte entrou a dizer de mim nomes feios e acabou alcunhando me Dom Casmurro

No dia seguinte entrou a dizer
de mim nomes feios e acabou
alcunhando me Dom Casmurro

5 2 2
a de i de o

5 2 2
a e i o u

*/