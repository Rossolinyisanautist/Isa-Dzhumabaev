import java.util.*;

public class URI_1318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt(), M = sc.nextInt();
            if(N + M == 0)
                break;

            int c = 0;
            ArrayList<Integer> list = new ArrayList();
            for(int i = 0; i < M; i++){
                list.add(sc.nextInt());
            }
            ArrayList<Integer> set = new ArrayList<>(new LinkedHashSet<>(list));
            for(int i = 0; i < set.size(); i++){
                if(Collections.frequency(list, set.get(i)) > 1){
                    c++;
                }
                set.remove(i--);
            }
            System.out.println(c);
        }
    }
}/*

 */