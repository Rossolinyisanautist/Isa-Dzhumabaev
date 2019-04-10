import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, length;
        float cost = 0, kilograms = 0;
        String output = "";

        while(i++ < n){
            cost += sc.nextFloat();
            sc.nextLine();
            length = sc.nextLine().split(" ").length;
            kilograms += length;

            output = output.concat("day " + i + ": " + length + " kg\n");
        }

        System.out.print(output);
        System.out.printf("%.2f kg by day%n", kilograms / n);
        System.out.printf("R$ %.2f by day%n", cost / n);

    }
}/*
3
9.58
Mamao Maca Melao
2.65
Melancia
9.54
Pera Uva Goiaba

*/