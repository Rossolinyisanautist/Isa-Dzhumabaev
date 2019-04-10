import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt(), i;
            String[] input = new String[n];
            for(i = 0; i < n; i++)
                input[i] = sc.next();
            input = new HashSet<>(Arrays.asList(input)).toArray(new String[0]);
            System.out.printf("Falta(m) %d pomekon(s).%n", 151 - input.length);
        }while(sc.hasNext());
    }
}

