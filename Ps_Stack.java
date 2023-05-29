import java.util.Stack;

public class Ps_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        // ((Object) stack).isFull();
        System.out.println(stack);
    }
    
}
