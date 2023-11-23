import java.util.Stack;
public class StackTwo {
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println("The top element is " + stack.peek());

        stack.pop(); //removing the element d
        stack.pop(); //removing the element c
        stack.pop(); //removing the element b

        System.out.println("The stack size " + stack.size());

        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
