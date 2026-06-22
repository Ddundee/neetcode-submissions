class Node{
    private int data;
    private Node next;
    private Node prev;

    public Node(int val){
        this.data = val;
        this.next = null;
        this.prev = null;
    }

    public Node(){
        this.data = 0;
        this.next = null;
        this.prev = null;
    }
}



class Deque {
    private Node head;
    private Node tail;
    private int size;

    public Deque() {
        this.head = new Node(-1);
        this.tail = this.head;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
       if(size == 0){
        head = newNode;
        newNode.prev = head;
        tail = newNode;
       }
       tail.next = newNode;
       newNode.prev = tail;
        tail = newNode;
       size++;
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        if(size == 0){
            newNode = head;
            head.prev = newNode;
            head = newNode;
            tail = head.next;
        }
        newNode = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public int pop() {
       if(isEmpty()){
        return -1;
       }
       Node temp = tail;
       if(size == 1){
        this.head = null;
        this.tail = null;
       }else{
        tail.prev = tail;
       }
        size--;
       return temp.data;
    }
    public int popleft() {
        if(isEmpty()){
            return -1;
        }
         Node temp = head;
        if(size == 1){
        this.head = null;
        this.tail = null;
        }else{
        head.next = head;
        }
        size--;
        return temp.data;
    }
}
