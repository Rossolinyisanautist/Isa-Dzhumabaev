import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] vars = new int[16];

        for(int i = 0; i < 16; i++)
            vars[i] = i;

        System.out.println("---------------------------------------");
        System.out.println("|  decimal  |  octal  |  Hexadecimal  |");
        System.out.println("---------------------------------------");
        for(int i = 0; i < 16; i++){
            String octal = Integer.toOctalString(vars[i]);
            String hexa = Integer.toHexString(vars[i]).toUpperCase();
            if(i < 8)
                System.out.printf("|      %d    |    %s    |       %s       |%n", vars[i], octal, hexa);
            else if(i < 10)
                System.out.printf("|      %d    |   %s    |       %s       |%n", vars[i], octal, hexa);
            else
                System.out.printf("|     %d    |   %s    |       %s       |%n", vars[i], octal, hexa);
        }
        System.out.println("---------------------------------------");
    }
}
