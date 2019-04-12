/*
import java.util.*;

class URI_1031 {

    private URI_1031(){}

    static void fillArray(ArrayList<Integer> arrayList, int size){
        if(size == 0){
            throw new ArrayStoreException();
        }

        Integer[] array = new Integer[size];
        for(int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        arrayList.addAll(Arrays.asList(array));
    }

    static int findStep(ArrayList<Integer> arrayList){
        ArrayList<Integer> newList = new ArrayList<>(arrayList);

        int step = 1;
        while(true){
            removeByStep(newList, step);

            if(newList.get(0) == 13){
                return step;
            }
            newList = new ArrayList<>(arrayList);
            step++;
        }
    }
    private static void removeByStep(ArrayList<Integer> arrayList, int step){
        int i = 0;
        while(arrayList.size() != 1){

            arrayList.remove(i--);
            i += step;

            while(i >= arrayList.size()){
                i -= arrayList.size();
            }
        }
    }
}
*/
