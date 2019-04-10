import java.util.*;

public class Main2 {
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

                    k = j;
                    l = k + 1;
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
}/*

He has four fanatic fantastic fans
h h f f f f
There may be no alliteration in a sequence
t m b n a i a s
Round the rugged rock the ragged rascal ran
r t r r t r r r
area artic Soul Silly subway ant artic none
a a s s s a a n

2
0
2
3
*/
*/