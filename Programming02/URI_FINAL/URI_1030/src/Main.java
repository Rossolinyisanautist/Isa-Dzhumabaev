import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), count = 0;
        while(count++ < n){

            ArrayList<Integer> man = new ArrayList<>();
            int length = sc.nextInt();
            int step = sc.nextInt() - 1;

            for(int i = 1; i <= length; i++)
                man.add(i);

            for(int toKill = step; man.size() > 1; toKill += step){

                while(toKill >= man.size())
                    toKill -= man.size();

                man.remove(toKill);
            }

            System.out.printf("Case %d : %d%n", count, man.get(0));
        }
    }
}/*
6
1 1
10000 1000
1 1000
10000 1
10000 2
10000 3

Case 1: 1
Case 2: 5981
Case 3: 1
Case 4: 10000
Case 5: 3617
Case 6: 2692

*/