class DynamicArray {

    private Object[] dynamicArray;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        this.dynamicArray = new Object[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    public int get(int i) {
        return (int)dynamicArray[i];
    }

    public void set(int i, int n) {
        dynamicArray[i] = n;
    }

    public void pushback(int n) {
        if(capacity == length){
            resize();
        }
        dynamicArray[length] = n;
        length++;
    }

    public int popback() {
        int temp = (int)dynamicArray[length - 1];
        dynamicArray[length - 1] = null;
        length--;
        return temp;
    }

    private void resize() {
        capacity = 2 * capacity;    
        Object[] newArr = new Object[capacity];
        for(int i = 0; i < length; i++){
            newArr[i] = dynamicArray[i];
        }
        dynamicArray = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
