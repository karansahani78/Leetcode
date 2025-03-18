class MyLinkedList {

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1; // Invalid index
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else { 
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
        } else { 
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {  // Fixed condition
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(val);
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) { // Fixed loop condition
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) { // If added at the end, update tail
            tail = newNode;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {  // Fixed condition
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) { // If list becomes empty, update tail
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { // Fixed loop condition
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) { // If last element is deleted, update tail
                tail = temp;
            }
        }
        size--;
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */