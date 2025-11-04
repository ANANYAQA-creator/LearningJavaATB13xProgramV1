package ex_33_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab_220_Stack {
    public static void main(String[] args) {

        Stack stack = new Stack<>();
        stack.add("Python");
        stack.add("C++");
        stack.add("JAVA");
        System.out.println(stack); // [Python, C++, JAVA]
        System.out.println(stack.peek()); // Peek means who is at the top. // JAVA
        System.out.println(stack.pop()); // Pop Basically removes the top element
        System.out.println(stack); // [Python, C++]

        // Create Integer type stack
        Stack<Integer> IntegerStack = new Stack<>();

        IntegerStack.push(25);
        IntegerStack.push(65);
        IntegerStack.push(78); // Push will pushes an item at the top of the stack
        System.out.println(IntegerStack); // [25, 65, 78]
        // Create String type stack
        Stack<String> Stringstack = new Stack<>();


    }
}
