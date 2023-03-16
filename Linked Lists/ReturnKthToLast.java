/*
 * Approach : 
 * Use a while loop to count the number of nodes in the linked list.
 * Then use another loop to get to the (count-k)th element and return it
 * 
 * Space Complexity : O(1)
 * Time Complexity : O(N)
 * 
 * Note : A better approach would have been to use two pointers and place 
 * them k nodes apart. Then move the pointers simultaneously and when the
 * latter one hits null, return the first one
 */
public class ReturnKthToLast {
    public Node KthElement(Node head, int k) {
        Node curr = head;
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        int val = count-k;
        int i = 0;
        while(i < val) {
            curr = curr.next;
            i++;
        }
        return curr;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.insert(2, 1);
        ll.insert(3, 2);
        ll.insert(4, 3);
        ll.insert(5, 4);
        ll.insert(6, 5);
        ll.printList();
        System.out.println();
        ReturnKthToLast obj = new ReturnKthToLast();
        System.out.println("4th element form last : "+obj.KthElement(ll.head, 4).data);
    }
}
