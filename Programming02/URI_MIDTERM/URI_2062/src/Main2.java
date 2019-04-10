import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = Integer.parseInt(sc.next());
            String result = "";
            while(n-- > 0) {
                String input = sc.next();
                if (input.length() == 3) {
                    input = input.replaceAll("UR[^ I]", "URI");
                    input = input.replaceAll("OB[^ I]", "OBI"); }
                result = result.concat(input + " ");
            }
            System.out.println(result.trim());
        }while(sc.hasNext());
    }
}/*
10
URA URO URI URU UROS IBO OBA OBAS OBES OBE
*/