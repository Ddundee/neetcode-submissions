class Node{
    private int data;
    private Node next;
    private Node prev;

    public Node(int val){
        this.data = val;
        this.next = null;
        this.prev = null;
    }

}

class Deque {
    private int size;
    private Node head;
    private Node tail;
    public Deque() {
        this.head = new Node(0);
        this.tail = new Node(0);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }

    public void append(int value) {
       Node newNode = new Node(value);
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        newNode.next = tail;
        tail.prev = newNode;
        size++;

    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
        size++;
    }

    public int pop() {
        if(size == 0){
            return -1;
        }
        Node temp = tail.prev;
        Node temp2 = temp.prev;
        Node value = temp;

        temp2.next = tail;
        tail.prev = temp2;

        size--;
        return temp.data;
    }
    public int popleft() {
       if(isEmpty()){
            return -1;
        }
        Node temp = head.next;
        head.next = head.next.next;
        temp.next.prev = head;
        size--;
        return temp.data;
    }
}
