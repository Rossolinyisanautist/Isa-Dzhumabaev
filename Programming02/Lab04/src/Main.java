import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayListInteger2 list = new ArrayListInteger2();

        while(sc.hasNextInt())
            list.add(sc.nextInt());

        System.out.print("Before reversing: ");
        printList(list);

        reverse(list);
        System.out.print("After reversing: ");
        printList(list);

        insertZeroBeforeEvenNumber(list);
        System.out.print("After insertion: ");
        printList(list);

        removeOddNumbers(list);
        System.out.print("After removal: ");
        printList(list);
    }

    private static void removeOddNumbers(ArrayListInteger2 list) {
        for(int i = 0; i < list.size(); i++)
            if(list.get(i) % 2 != 0)
                list.remove(i--);
    }

    private static void insertZeroBeforeEvenNumber(ArrayListInteger2 list) {
        for(int i = 0; i < list.size(); i++)
            if(list.get(i) % 2 == 0)
                list.add(i++, 0);
    }
    private static void printList(ArrayListInteger2 list) {
        String output = "";
        for(int i = 0; i < list.size(); i++)
            output = output.concat(list.get(i) + " ");
        System.out.println(output.trim());
    }
    private static void reverse(ArrayListInteger2 list){
        for(int i = 0, j = list.size() - 1; i < j; i++, j--){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
