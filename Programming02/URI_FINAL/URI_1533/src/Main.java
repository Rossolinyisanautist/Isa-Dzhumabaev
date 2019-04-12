import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0)
                break;

            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }
            ArrayList<Integer> temp = new ArrayList<>(new HashSet<>(list));
            Collections.sort(temp);
            Collections.reverse(temp);
            System.out.println(list.indexOf(temp.get(1)) + 1);
        }
    }
}/*
3
3 5 2
5
1 15 3 5 2
0

3
3 5 2
5
1 15 3 5 2
10
0 1 2 3 4 5 6 7 8 9
10
9 8 7 6 5 4 3 2 1 0
10
9 0 1 2 3 4 5 6 7 8
0


*/