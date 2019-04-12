import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> set = new ArrayList<>(new HashSet<>(numbers));
        Collections.sort(set);
        for(int number : set){
            System.out.printf("%d aparece %s vez(es)%n", number, Collections.frequency(numbers, number));
        }
    }
}/*
7
8
10
8
260
4
10
10

*/