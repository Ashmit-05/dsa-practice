public class StackLinkedList {
    Node head;
    Node curr;
    StackLinkedList() {
        head = new Node();
        curr = head;
    }
    
    public int pop() {
        try {
           int val = curr.val;
           Node temp = head;
           while(temp.next != curr) {
               temp = temp.next;
           }
           temp.next = null;
           curr = temp;
           return val;
        } catch(Exception e) {
            System.out.println("An error occured");
            throw new Error(e);
        }
    }

    public void push(int val) {
        Node n = new Node();
        n.val = val;
        n.next = null;
        curr.next = n;
        curr = curr.next;
        System.out.println("Added " + val + " to the stack");
    }
    
    public int peek() {
        return curr.val;
    }

    public boolean isEmpty() {
        return (head.next == null)?true:false;
    }
}
