import java.util.*;

public class URI_1104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt(), M = sc.nextInt();
            if(N + M == 0)
                break;

            Integer[] alice = new Integer[N];
            Integer[] betty = new Integer[M];

            int i;
            for(i = 0; i < N; i++){
                int inp = sc.nextInt();
                alice[i] = inp;
            }
            for(i = 0; i < M; i++){
                int inp = sc.nextInt();
                betty[i] = inp;
            }
            ArrayList<Integer> Alice = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(alice)));
            ArrayList<Integer> Betty = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(betty)));
            if(Alice.size() < Betty.size()){
//                Alice = Alice ^ Betty;
//                Betty = Alice ^ Betty;
//                Alice = Alice ^ Betty;
            }
            int count = Betty.size();
            for(i = 0; i < Betty.size(); i++){
                if(Collections.binarySearch(Alice, Betty.get(i)) >= 0){
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}