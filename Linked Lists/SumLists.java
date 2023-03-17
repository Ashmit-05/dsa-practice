/*
 * Approach :
 * Add each node data and check for carry value.
 * Continue till all nodes are added and also check if any of
 * the linked lists gets , and add the rest of the elements in case
 * it does
 *
 * Time Complexity : O(M+N)
 * Space Complexity : O(M+N)
 */
import java.util.Scanner;
public class SumLists{
    public LinkedList sumList(Node head1,Node head2) {
        int carry = 0;
        LinkedList sum = new LinkedList();
        int count = 0;
        while(head1 != null && head2 != null) {
            int val = head1.data + head2.data + carry;
            if(val >= 10) {
                val = val%10;
                carry = 1;
            } else {
                carry = 0;
            }
            sum.insert(val,count);
            count++;
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 == null && head2 != null) {
            while(head2 != null) {
                int val = head2.data + carry;
                if(val >= 10) {
                    val = val%10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                sum.insert(val,count);
                head2 = head2.next;
                count++;
            }
        }
        if(head1 != null && head2 == null) {
            while(head1 != null) {
                int val = head1.data + carry;
                if(val >= 10) {
                    val = val%10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                sum.insert(val,count);
                head1 = head1.next;
                count++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(7,0);
        //l1.insert(1,1);
        //l1.insert(6,2);
        l1.printList();
        System.out.println();
        LinkedList l2 = new LinkedList();
        l2.insert(5,0);
        l2.insert(9,1);
        l2.insert(2,2);
        l2.printList();
        System.out.println();
        SumLists obj = new SumLists();
        LinkedList sum = new LinkedList();
        sum = obj.sumList(l1.head,l2.head);
        sum.printList();
    }
}
            
