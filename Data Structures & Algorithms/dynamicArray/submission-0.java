class DynamicArray {
    int[] list;
    int size;
    public DynamicArray(int capacity) {
        list = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return list[i];
    }

    public void set(int i, int n) {
        list[i] = n;
    }

    public void pushback(int n) {
    if (size == list.length) {
        resize();
    }
    list[size] = n;
    size++;
}


    public int popback() {
        return list[--size];
    }

    private void resize() {
        int[] newList = new int[list.length * 2];
        for(int i = 0; i < size; i++) {
            newList[i] = list[i];
        }

        list = newList;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return list.length;
    }
}
