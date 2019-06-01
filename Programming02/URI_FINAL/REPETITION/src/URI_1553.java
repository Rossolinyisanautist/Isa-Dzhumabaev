import java.util.*;

public class URI_1553 {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(N == K && K == 0){break;}

            List<Integer> Questions = new ArrayList<>();
            for(int i = 0; i < N; i++){
                 Questions.add(sc.nextInt());
            }
            List<Integer> set = new ArrayList<>(new HashSet<>(Questions));
            int count = 0;
            for(int i = 0; i < set.size(); i++){
                int frequency = Collections.frequency(Questions, set.get(i));
                if(frequency >= K){
                    set.remove(i--);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}/*
5 2
1 4 2 1 3
5 2
1 1 2 3 2
8 3
1 1 3 5 4 6 3 4
8 3
1 1 1 1 1 1 1 1
0 0

*/