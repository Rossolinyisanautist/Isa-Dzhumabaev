 class ArrayListInteger2 {
    private int[] items;
    private int size;

    ArrayListInteger2(){
        items = new int[10];
        size = 0;
    }

    int get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return items[index];
    }

    void set(int index, int value){
        items[index] = value;
    }
    int size(){
        return size;
    }

    void add(int value){

        if(size + 1 >= items.length){
            int[] newItems = new int[items.length + items.length / 2];

            for(int i = 0; i < size; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[size] = value;
        size++;
    }

    void add(int index, int value){
        if(index < 0 || index >= size + 1)
            throw new IndexOutOfBoundsException();

        if(size + 1 >= items.length){
            int[] newItems = new int[items.length + items.length / 2];

            for(int i = 0; i < index; i++)
                newItems[i] = items[i];

            for(int i = index; i < size; i++)
                newItems[i + 1] = items[i];
            items = newItems;
        }
        else {
            for(int i = size; i >= index; i--){
                items[i] = items[i - 1];
            }
        }
        items[index] = value;
        size++;
    }

    void remove(int index){
        if(index < 0 || index >= size)
            throw  new IndexOutOfBoundsException();

        for(int i = index + 1; i < size; i++)
            items[i - 1] = items[i];

        size--;
    }
}
