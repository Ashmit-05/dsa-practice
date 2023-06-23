import java.util.ArrayList;
public class StackArray{
    ArrayList<Integer> stack;
    StackArray() {
        stack = new ArrayList<>();
    }

    public int pop() {
        try {
            int val = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return val;
        } catch(Exception e) {
            System.out.println("An error occured");
            throw new Error(e);
        }
    }

    public void push(int val) {
        try {
            stack.add(val);
            System.out.println("Added "+val+" to the stack");
        } catch(Exception e) {
            System.out.println("An error occured");
        }
    }

    public int peek() {
        try {
            return stack.get(stack.size()-1);
        } catch(Exception e) {
            System.out.println("An error occured");
            throw new Error(e);
        }
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
