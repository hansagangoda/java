import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    
    public Stack() {
        stack = new LinkedList<>();
    }

    
    public void push(int value) {
        stack.addLast(value);
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeLast();
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getLast();
    }

    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    public void traverse() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

   
    public static void main(String[] args) {
        Stack s = new Stack();
        
        // Pushing elements onto the stack
        s.push(11);
        s.push(22);
        s.push(33);

        System.out.println("Stack contents:");
        s.traverse(); // Should display 30, 20, 10

       
        System.out.println("Popped value: " + s.pop()); // Should display 30

        System.out.println("Stack contents after pop:");
        s.traverse(); // Should display 20, 10

        
        System.out.println("Top value: " + s.peek()); // Should display 20
    }
}
