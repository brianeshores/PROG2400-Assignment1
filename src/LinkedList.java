public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void append(Object value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public void prepend(Object value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public Node head() {
        return this.head;
    }

    public Node tail() {
        return this.tail;
    }

    public Node at(int index) {
        int counter = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            if (counter == index) {
                return currentNode;
            }
            counter++;
            currentNode = currentNode.next;
        }
        return null;
    }

    public void pop() {
        if (this.head == null) {
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node pre = this.head;
        Node tail = this.head.next;

        while (tail.next != null) {
            pre = tail;
            tail = tail.next;
        }

        pre.next = null;
        this.tail = pre;
        this.size--;
    }

    public boolean contains(Object value) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public Integer find(Object value) {
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return null;
    }
}