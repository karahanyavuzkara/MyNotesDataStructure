import java.util.*;
public class StackDemo {
    public static void main(String args[]){

        Stack<String> stack = new Stack<String>();

        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        System.out.println("Initial Stack: " + stack);
        System.out.println("Popped Element : " + stack.pop());
        System.out.println("Popped Element : " + stack.pop());
        System.out.println("Stack after pop operation" + stack.pop());
    }
}
