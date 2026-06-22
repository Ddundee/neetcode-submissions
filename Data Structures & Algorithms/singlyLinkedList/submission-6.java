class Node{
    Node next;
    int data;

    public Node(int something){
        data = something;
        next = null;
    }
    public Node(){
        this.data = data;
        this.next = next;
    }
    public int getData(){
        return data;
    }
    public Node getnext(){
        return next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int get(int index) {
        Node curr = head;
        int i = 0;
        if(index >= size){
            return -1;
        }
        while(i != index){
            curr = curr.next;
            i++;
        }
        return curr.getData();
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
           head = newNode;
           tail = head;
           size++;
        } else if(head == tail){
            newNode.next = tail;
            head = newNode;
            size++;
        }else{
        newNode.next = head;
        head = newNode;
        size++;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(tail == null){
           head = newNode;
           tail = newNode;
           size++;
        }else{
        tail.next = newNode;
        tail = newNode;
        size++;
        }
    }

    public boolean remove(int index) {
        Node curr = head;
        int i = 0;
        while(curr.next != null){
            curr = curr.next;
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            list.add(curr.getData());
            curr = curr.next;
        }
        return list;
    }
}
