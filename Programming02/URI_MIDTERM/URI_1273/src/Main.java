import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0){
            sc.nextLine();
            String[] input = new String[n];
            for(int i = 0; i < input.length; i++){
                input[i] = sc.next();
            }
            int indexOfLongest = getLongestStringIndex(input);
            int maxLength = input[indexOfLongest].length();               // length of longest string
            char[][] result = new char[input.length][maxLength];          // new 2D array has n strings and each string's length equals to maxLength

            for(int i = 0; i < result.length; i++){
                if(i != indexOfLongest){
                    for(int j = 0, k = 0; j < maxLength; j++){
                        if(j < maxLength - input[i].length()){           // check weather we have to put " " or letters of sting
                            result[i][j] = ' ';
                        }
                        else {
                            result[i][j] = input[i].charAt(k);          //
                            k++;
                        }
                    }
                }
                else {
                    result[i] = input[indexOfLongest].toCharArray();    // if we reached longest sting then we just put it in "result" array;
                }
            }

            for(int i = 0; i < result.length; i++){
                System.out.println(new String(result[i]));
            }
            System.out.println();
            n = sc.nextInt();
        }
    }
    static int getLongestStringIndex(String[] list){
        int index = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i].length() > list[index].length()){
                index = i;
            }
        }
        return index;}
}