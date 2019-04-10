
// THIS SOLUTION IS OK
// Main2 IS NOT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] first, second;
        int maxLength, tempLength, i, j, k, l;

        while(sc.hasNext()){
            first = sc.nextLine().toCharArray();
            second = sc.nextLine().toCharArray();
            maxLength = 0;

            for(i = 0; i < first.length; i++)
                for(j = 0; j < second.length; j++){
                    tempLength = 0;

                    k = i;
                    l = j;
                    while (l < second.length && k < first.length){
                        if(first[k++] != second[l++])
                            break;
                        tempLength++;
                    }
                    maxLength = tempLength > maxLength ? tempLength : maxLength;
                }
            System.out.println(maxLength);
        }
    }
}