import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        System.out.println("Stack : " + stack);

        String poppedElement = stack.pop();
        System.out.println("Popped element : " + poppedElement);

        System.out.println("Now the stack looks like : " + stack);

        String peekElement = stack.peek();
        System.out.println("Top Element : " + peekElement);
    }
}
