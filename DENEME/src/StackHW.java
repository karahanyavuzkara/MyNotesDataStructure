import java.util.Stack;

public class StackHW {
    public static void main(String[]args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(15);
        stack.add(30);
        stack.add(20);
        stack.add(5);

        int popped = stack.pop();
        System.out.println("Initial Stack : " + stack);

        System.out.println("Popped element : "+ popped);


        int popped2 = stack.pop();
        System.out.println("Popped element : "+ popped2);

        System.out.println("Stack after pop operation: " + stack);
    }
}
