class Node {
    private int data;
    private Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
        this.size = 0;
    }

    public int get(int index) {
        if(index >= size){
            return -1;
        }
        Node curr = head.next;
        int i = 0;
        while(i < index){
            i++;
            curr = curr.next;
        }
        return curr != null ? curr.data : -1;
    }

    public void insertHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head.next;
        head.next = newnode;
        if(newnode.next == null){
            tail = newnode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newnode = new Node(val);
        if(size == 0){
            head.next = newnode;
            tail = newnode;
        }else{
            tail.next = new Node(val);
            tail = tail.next;
        }
        size++;
    }

      public boolean remove(int index) {
        int i = 0;
        Node curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        // Remove the node ahead of curr
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }
    public ArrayList<Integer> getValues() {
    ArrayList<Integer> list = new ArrayList<>();
    Node curr = head.next;
    int i = 0;
    while(curr != null){
        list.add(curr.data);
        i++;
        curr = curr.next;
    }
    return list;
    }
}
