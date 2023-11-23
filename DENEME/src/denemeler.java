import java.util.Stack;

public class denemeler {
    public static void main(String[]args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(61);
        stack.add(54);
        stack.add(34);
        stack.add(25);
        stack.add(9);

        System.out.println("Stack : " + stack);
        Integer popped = stack.pop();
        System.out.println("Popped : "+ popped);
        Integer popped2 = stack.pop();
        System.out.println("Popped2 : " + popped2);
        System.out.println("New Stack : " + stack);


    }
}
