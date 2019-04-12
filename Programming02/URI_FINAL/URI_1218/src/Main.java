import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, count, f;

        String size = sc.nextLine(), input = sc.nextLine(), output;

        while(true){
            n++;
            count = f = 0;

            for(String s : input.split("(?<!\\G\\w+)\\s"))
                if(s.contains(size)) {
                    count++;
                    if (s.contains("F"))
                        f++;
                }

            output = "Caso " + n +
                  ":\nPares Iguais: " + count +
                   "\nF: " + f +
                   "\nM: " + (count - f);

            System.out.println(output);

            if(!sc.hasNext())
                break;

            System.out.println();

            size = sc.nextLine();
            input = sc.nextLine();

        }
    }
}/*
23
23 F 28 M 23 F 40 M 36 F 23 M 23 F 24 M 23 M

*/