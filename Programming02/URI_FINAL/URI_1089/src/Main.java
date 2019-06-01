import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int peaks = 0;
            int[] list = new int[n];

            for(int i = 0; i < n; i++){
                list[i] = sc.nextInt();
            }

            int first = list[0];
            int second = list[1];
            int last = list[n - 1];
            int preLast = list[n - 2];
            //case 1. a
            if(preLast < last && last > first && first < second){
                peaks += 2;
            }//case 1. b
            else if(preLast > last && last < first && first > second){
                peaks += 2;
            }//case 2. a
            else if(preLast < last && last > first && first > second){
                peaks++;
            }//case 2. b
            else if(preLast > last && last < first && first < second){
                peaks++;
            }//case 3. a
            else if(preLast < last && last < first && first > second){
                peaks++;
            }//case 3. b
            else if(preLast > last && last > first && first < second){
                peaks++;
            }
            for(int i = 1; i < n - 1; i++){
                int prev = list[i - 1];
                int current = list[i];
                int next = list[i + 1];
                if(prev < current && current > next){
                    peaks++;
                }
                else if(prev > current && current < next){
                    peaks++;
                }
            }
            System.out.println(peaks);
        }
    }
}