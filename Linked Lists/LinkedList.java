public class LinkedList{
    public Node head;
    public Node tail;
    public int size;
    public LinkedList(int data) {
        Node n = new Node(data);
        this.head = n;
        this.tail = this.head;
        size = 1;
    }
    private void createList(int data) {
        Node n = new Node(data);
        head = n;
        tail = head;
        size = 1;
    }
    public void insert(int data,int location) {
        if(head == null) {
            createList(data);
        } else {
            Node n = new Node(data);
            if(location == 0) {
                n.next = head;
                head = n;
            } else if(location >= size) {
                tail.next = n;
                tail = n;
            } else {
                Node x = head;
                for(int i = 1; i < location-1; i++) {
                    x = x.next;
                }
                n.next = x.next;
                x.next = n;
            }
            size++;
        }
    }
    public void printList() {
        Node x = head;
        while(x != null) {
            System.out.print(x.data + " --> ");
            x = x.next;
        }
    }
}
        