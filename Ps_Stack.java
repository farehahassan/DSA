// import java.util.Stack;

// public class Ps_Stack {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<Integer>();
        
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.pop();
//         // ((Object) stack).isFull();
//         System.out.println(stack);
//     }
    
// }


//revision

public class Ps_Stack{

    private int maxSize;
    private int[] array;
    private int top;

    public Ps_Stack(int s){
        maxSize = s ;
        array = new int[maxSize];
        top = -1;
    }

    public void push (int j ){
        array[++top] = j;
    }
    public int pop(){
        return array[top--];
    }
    public int top(){
        return array[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize+1);
    }
    public static void main(String[] args) {
        Ps_Stack stack = new Ps_Stack(6);
        stack.push(2);
        stack.push(5);
        stack.push(8);
        stack.push(3);
        stack.pop();
        stack.isFull();
        // System.out.println(stack);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.print(value+" ");        
         }
    }
}


/*     Stack   
 * --> LIFO data structure (Last in first out)
 * --> stores object into a sort of "vertical tower"
 * --> push() to add to the top
 * --> pop() to remove from the top 
 * --> peek() return top element without removing 
 * --> isEmpty() check whether stack is empty or not 
 * --> isFull() find if element exists or not 
 */
