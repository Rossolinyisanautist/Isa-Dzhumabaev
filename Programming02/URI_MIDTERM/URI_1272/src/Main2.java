// BULLSHIT SOLUTION
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//scanner.nextInt();
        scanner.nextLine();
        for(int c = 0; c < N; c++){
            char[] input = scanner.nextLine().toCharArray();
            int k = 0;
            while(k <  input.length){

                while(k < input.length && input[k] == ' '){
                    k++;
                }
                if(k < input.length){
                    System.out.print(input[k]);
                }
                while(k < input.length && input[k] != ' '){
                    k++;
                }
            }
            System.out.println();
        }
    }
}
/*
4
compete online design event rating
  u    r i  o    n l  i    n  e

round  elimination during  onsite  contest
*/
