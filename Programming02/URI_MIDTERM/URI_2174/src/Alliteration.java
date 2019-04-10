import java.util.*;

public class Alliteraion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String[] input = sc.nextLine().toLowerCase().split(" ");
            int alliterations = 0, i, j, k, l;

            for (i = 0; i < input.length; i++)
                input[i] = input[i].substring(0, 1);

            for(i = 0, j = i + 1; j < input.length; i++, j++)
                if(input[i].equals(input[j])){
                    alliterations++;

                    k = j; // i = j;
                    l = j + 1; // j = j + 1;
                    while(l < input.length){
                        i = k;
                        j = l;
                        if(!input[k++].equals(input[l++]))
                            break;
                    }
                }
            System.out.println(alliterations);
        }while(sc.hasNext());
    }
}