// Read the question carefully. This is not what was expected
public class DeleteMiddleNode {
    public void delete(Node head) {
        int count = 0;
        Node curr = head;
        while(head != null) {
            head = head.next;
            count++;
        }
        int x = count/2;
        int i = 1;
        while(i < x-1) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.insert(2, 1);
        ll.insert(3, 2);
        ll.insert(4, 3);
        ll.insert(5, 4);
        ll.insert(6, 5);
        ll.insert(7,6);
        ll.printList();
        DeleteMiddleNode obj = new DeleteMiddleNode();
        obj.delete(ll.head);
        System.out.println();
        ll.printList();
    }
}
