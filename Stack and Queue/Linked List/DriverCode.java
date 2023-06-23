public class DriverCode {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        System.out.println("Is the stack empty : "+s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Pop : "+s.pop());
        System.out.println("Peek : "+s.peek());
        System.out.println("Is the stack empty : "+s.isEmpty());
    }
}
