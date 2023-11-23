import java.util.Stack;
public class stackemptydeneme {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.add(10);
    stack.add(11);
    stack.add(12);
    stack.add(13);
    stack.add(14);

    boolean isEmpty = stack.isEmpty();

    while (!stack.isEmpty()) {
    System.out.println("Popped element : " +stack.pop());
    }
    isEmpty = stack.isEmpty();
    System.out.println("Is the stack empty : " + isEmpty);
    }
}

