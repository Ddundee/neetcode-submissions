
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
        this.head = new Node(-1);  // Dummy node
        this.tail = this.head;
        this.size = 0;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;  // Return -1 for invalid index
        }
        Node curr = head.next;  // Start from the first actual node
        int i = 0;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        return curr != null ? curr.data : -1;  // Return data if node exists
    }

    public void insertHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head.next;  // Link new node to the first node
        head.next = newnode;       // Update head's next to new node
        if (newnode.next == null) {
            tail = newnode;  // If new node is the only node, update tail
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head.next = newNode;  // Set head.next if list is empty
            tail = newNode;       // Set tail to the new node
        } else {
            tail.next = newNode;  // Link last node to the new node
            tail = newNode;       // Update tail pointer
        }
        size++;  // Increment size of the list
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;  // Return false if index is out of bounds
        }

        Node curr = head;  // Start from the dummy node
        int i = 0;
        while (i < index && curr != null) {
            curr = curr.next;
            i++;
        }

        // If we're removing a valid node
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;  // Update the tail if we're removing the last node
            }
            curr.next = curr.next.next;  // Remove the node at the specified index
            size--;  // Decrease the size of the list
            return true;
        }

        return false;  // Return false if no node was removed
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head.next;
        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }
        return list;
    }
}
