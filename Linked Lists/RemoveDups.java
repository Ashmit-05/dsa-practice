/*
 * Approach 1 :
 * Implementation using a hashset. Check if the present node exists in the
 * hashset. If it remove that node, else add it to the hashset 
 * and move to the next node
 * 
 * Space Complexity : O(N)
 * Time Complexity : O(N)
 */
import java.util.HashSet;
import java.util.Scanner;;
public class RemoveDups{

    public void remove(Node head) {
        Node prev = head;
        HashSet<Integer> set = new HashSet<>();
        while(head != null) {
            if(!set.contains(head.data)) {
                set.add(head.data);
                prev = head;
                head = head.next;
            }
            else {
                prev.next = head.next;
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList(3);
        ll.insert(3, 0);
        ll.insert(4, 0);
        ll.insert(4, 7);
        ll.insert(5, 2);
        ll.printList();
        RemoveDups obj = new RemoveDups();
        System.out.println();
        obj.remove(ll.head);
        ll.printList();
        sc.close();
    }
}

/*
 * Approach 2 :
 * If auxiliary space is not allowed, we use two pointers technique
 * 
 * Space Complexity : O(1)
 * Time Complexity : O(N^2)
 */