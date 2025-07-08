package day9;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a stack using Vector
        Stack <Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements: " + stack);

        // Pop an element from the stack
        if (!stack.isEmpty()) {
            int poppedElement = stack.remove(stack.size() - 1);
            System.out.println("Popped element: " + poppedElement);
        } else {
            System.out.println("Stack is empty, nothing to pop.");
        }

        System.out.println("Stack after popping: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Size of the stack: " + stack.size());
        
        // Print the top element using peek()
        System.out.println("Element: " + (stack.isEmpty() ? "Stack is empty" : stack.peek()));
    }
}
