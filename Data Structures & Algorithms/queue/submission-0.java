class Node {
    int val;
    Node prev, next;
    Node(int val,  Node prev, Node next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
class Deque {
    Node head;
    Node tail;
    public Deque() {
        head = null;
        tail = head;
    }

    public boolean isEmpty() {
        return head == tail && tail == null;
    }

    public void append(int value) {
       tail = new Node(value, tail, null);
    }

    public void appendleft(int value) {
        head = new Node(value, null, head);
    }

    public int pop() {
        
        if(isEmpty()) return -1;
        int val = tail.val;
        tail = tail.prev;
        return val;
    }

    public int popleft() {
        if(isEmpty()) return -1;
        int val = head.val;
        head = head.next;
        return val;
    }
}
