
import java.util.Iterator;
import java.util.Stack;

public class PlayStack {
    
    public static void main (String []args ) {
        
        
        // Set up a stack of Strings
        Stack<String> stringStack = new Stack<String>();
        // Push elements onto the stack
        stringStack.push("Mark Reha");
        stringStack.push("Mary Reha");
        stringStack.push("Justine Reha");
        stringStack.push("Rianna Reha");
        
        // Set up a stack of integers
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);
        integerStack.push(-1);
        integerStack.push(5);
        integerStack.push(10);
        
        // Print out size and top element of the stack
        System.out.println(integerStack); 
        System.out.printf("Integer Stack Tests: size is %d and top element is %d\n", integerStack.size(), integerStack.peek());
        
        // Use Iterator to get elements from the stack
        Iterator<String> itr = stringStack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }

}