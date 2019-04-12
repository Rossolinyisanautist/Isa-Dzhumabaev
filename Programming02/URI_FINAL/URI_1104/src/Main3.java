import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        ArrayList<Integer> Alice = getArray(N);
        ArrayList<Integer> Betty = getArray(M);

        Alice = new ArrayList<>(new LinkedHashSet<>(Alice));
        Betty = new ArrayList<>(new LinkedHashSet<>(Betty));

        System.out.println("Alice: " + Arrays.toString(Alice.toArray()));
        System.out.println("Betty: " + Arrays.toString(Betty.toArray()));
    }

    static ArrayList<Integer> getArray(int length){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < length; i++){
            array.add(sc.nextInt());
        }
        return array;
    }
}/*
10 9

1 1 2 3 5 7 8 8 9 15

2 2 2 3 4 6 10 11 11

*/