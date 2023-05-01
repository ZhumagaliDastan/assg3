import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<E> {
    private LinkedList<E> stack; // Initialize stack using LinkedList

    public MyStack() {
        stack = new LinkedList<>(); // Create a new empty LinkedList when a new MyStack object is created
    }

    public void push(E element) {
        stack.addFirst(element); // Add element to the top of the stack
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw an exception if stack is empty
        }
        return stack.getFirst(); // Return the element at the top of the stack
    }

    public boolean isEmpty() {
        return stack.isEmpty(); // Return true if stack is empty, false otherwise
    }

    public int size() {
        return stack.size(); // Return the number of elements in the stack
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException(); // Throw an exception if stack is empty
        }
        return stack.removeFirst(); // Remove and return the element at the top of the stack
    }
}

public class MyQueue<E> {
    private LinkedList<E> queue; // Initialize queue using LinkedList

    public MyQueue() {
        queue = new LinkedList<>(); // Create a new empty LinkedList when a new MyQueue object is created
    }

    public void enqueue(E element) {
        queue.addLast(element); // Add element to the end of the queue
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException(); // Throw an exception if queue is empty
        }
        return queue.removeFirst(); // Remove and return the first element in the queue
    }

    public boolean isEmpty() {
        return queue.isEmpty(); // Return true if queue is empty, false otherwise
    }

    public int size() {
        return queue.size(); // Return the number of elements in the queue
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException(); // Throw an exception if queue is empty
        }
        return queue.getFirst(); // Return the first element in the queue
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>(); // Create a new stack object of type String
        stack.push("Hello"); // Add "Hello" to the top of the stack
        stack.push("You!"); // Add "You!" to the top of the stack
        System.out.println("peek: " + stack.peek()); // Print the element at the top of the stack
        stack.pop(); // Remove the element at the top of the stack
        System.out.println("peek: " + stack.peek()); // Print the element at the top of the stack
        System.out.println("isEmpty: " + stack.isEmpty()); // Print whether or not the stack is empty
        System.out.println("size: " + stack.size()); // Print the number of elements in the stack

        MyQueue<String> queue = new MyQueue<>(); // Create a new queue object of type String
        queue.enqueue("Alice"); // Add "Alice" to the end of the queue
        queue.enqueue("Bob"); // Add "Bob" to the end of the queue
        System.out.println("peek: " + queue.peek()); // Print the first element in the queue
        System.out.println("size: " + queue.size()); // Print the number of elements in the queue
        System.out.println("removed: " + queue.dequeue()); // Remove and print the first element in the
