import java.util.*;

public class URI_1031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0){break;}

            Integer[] input = new Integer[n];
            for(int i = 0; i < n; i++){
                input[i] = i + 1;
            }

            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));

            int step = 1;
            while(list.get(0) != 13){
                list = new ArrayList<>(Arrays.asList(input));

                for(int i = 0; list.size() != 1; i = (i + step) % list.size()){
                    list.remove(i--);
                }
                step++;
            }
            System.out.println(step +- 1);
        }
    }
}
//import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            if(N == 0)  { break;}

            Integer[] list = new Integer[N];
            for(int i = 0; i < N; i++)  {list[i] = i + 1; }

            ArrayList<Integer> sortedList = new ArrayList<>(Arrays.asList(list));

            int step = 1;
            while(sortedList.get(0) != 13){
                sortedList = new ArrayList<>(Arrays.asList(list));

                int i = 0;
                while(sortedList.size() != 1){
                    sortedList.remove(i--);
                    i += step;
                    i = i % sortedList.size();
                }
                step++;
            }

            System.out.println(step - 1);
        }
    }
}