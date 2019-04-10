import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            String[] list = new String[sc.nextInt()];
            for (int i = 0; i < list.length; i++)
                list[i] = sc.next();

            Arrays.sort(list);
            for(String i : list)
                System.out.println(i);

        }while (sc.hasNext()) ;
    }
}