class ArrayListInteger {
    private int[] items;

    ArrayListInteger(){
        items = new int[0];
    }

    int get(int index){
        return items[index];
    }

    void set(int index, int value){
        items[index] = value;
    }
    int size(){
        return items.length;
    }

    void add(int value){
        int[] newItems = new int[items.length + 1];
        for(int i = 0; i < items.length; i++)
            newItems[i] = items[i];
        newItems[items.length] = value;

        items = newItems;
    }

    void add(int index, int value){
        int[] newItems = new int[items.length + 1];
        for(int i = 0; i < index; i++)
            newItems[i] = items[i];
        newItems[index] = value;
        for(int i = index; i < items.length; i++)
            newItems[i + 1] = items[i];
        items = newItems;
    }

    void remove(int index){
        int[] newItems = new int[items.length - 1];
        for(int i = 0; i < index; i++)
            newItems[i] = items[i];
        for(int i = index + 1; i < items.length; i++)
            newItems[i - 1] = items[i];
        items = newItems;
    }
}
