import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int N = sc.nextInt();
            Integer[] sheeps = new Integer[N];
            for(int i = 0 ; i < N; i++){
                sheeps[i] = sc.nextInt();
            }
            Set<Integer> set = new HashSet<>(Arrays.asList(sheeps));
            System.out.println(set.size());
        }
    }
}/*
3
3
1 2 3
3
1 2 1
5
100 1 1 0 0

5
5
1 1 3 2 4
7
12 12 3 4 6 3 7
10
11 102 3 5 8 3 3 15 11 90
2
1 1
17
11 102 3 5 8 3 3 15 11 90 21 21 31 4 5 13 8

*/