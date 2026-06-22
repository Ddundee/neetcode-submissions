
   class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

class LinkedList {
    private Node head;
    private Node tail;
    public int size;

    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
        size = 0;
    }

    public int get(int index) {
        Node dummy = head.next;
        int i = 0;
        while(dummy != null){
            if(i == index){
                return dummy.val;
            }
            i++;
            dummy = dummy.next;
        }
        return -1;
    }
    

    public void insertHead(int val) {
        Node nodeNext = new Node(val);
        nodeNext.next = head.next;
        head.next = nodeNext;
        if(nodeNext.next == null){
            tail = nodeNext;
        }
        size++;
    }

    public void insertTail(int val) {
        Node nodeNext = new Node(val);
        tail.next = nodeNext;
        size++;
    }

    public boolean remove(int index) {
        Node dummy = this.head;
        
        if(index >= size){
            return false;
        }

        for(int i = 0; i<index; i++){
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;
        size--;
        return true;

        /*
        int i = 0;
        while(i < index-1 && dummy != null){
            i++;
            dummy = dummy.next;
        }
        if(dummy.next == null){
            return false;
        }
        if(index == 0){
            dummy.next = this.head;
            return true;
        }

        if (dummy.next == this.tail){
            dummy = this.tail;
            return true;
        }
        dummy = dummy.next.next;
        return true; 

        */
    }
    

    public ArrayList<Integer> getValues() {
        ArrayList arr = new ArrayList<Integer>();
        Node list = this.head.next;
        while(list != null){
            arr.add(list.val);
            list = list.next;
        }
        return arr;

    }
}
