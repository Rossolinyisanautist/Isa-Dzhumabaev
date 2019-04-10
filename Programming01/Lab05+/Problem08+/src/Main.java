

public class Main {
    public static void main(String[] args) {
        System.out.println("          Multiplication table");
        System.out.print("     ");
        for(int i = 1; i <= 9; i++){
            System.out.printf(i + "   ");
        }
        System.out.println();
        for(int i = 0; i <= 38; i++){
        System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <=9; i++){
            System.out.print(i + "|");
            for(int j = 1; j <=9; j++){
                System.out.printf("%4d",j*i);
            }
            System.out.println();
        }

    }
}
