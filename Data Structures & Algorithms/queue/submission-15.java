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
    /* public int pop() {
    if (isEmpty()) {
        return -1;
    }

    Node temp = tail.prev;       // Get the last "real" node
    temp.prev.next = tail;       // Update the next pointer of the second-last node
    tail.prev = temp.prev;       // Update the prev pointer of the dummy tail

    size--;
    return temp.data;            // Return the value of the removed node
    }
    */
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
    /* 
    public int popleft() {
    if (isEmpty()) {
        return -1;
    }

    Node temp = head.next;       // Get the first "real" node
    head.next = temp.next;       // Update head to skip the first node
    temp.next.prev = head;       // Update the prev pointer of the new first node (dummy-safe)

    size--;
    return temp.data;            // Return the value of the removed node
    }
    */
}
