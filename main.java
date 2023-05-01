import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to select between two options (1 = MyCustomStack, 2 = MyCustomQueue)
        System.out.print("Please choose an option (1 = MyCustomStack, 2 = MyCustomQueue): ");
        int userInput = scanner.nextInt(); // Read the user's input

        switch (userInput) {
            case 1:
                MyCustomStack<String> stack = new MyCustomStack<>(); // Create an instance of MyCustomStack

                stack.push("Hello"); // Push "Hello" to the stack

                stack.push("World!"); // Push "World!" to the stack

                // Print the top element of the stack
                System.out.println("Top element: " + stack.peek());

                stack.pop(); // Remove the top element of the stack

                // Print the new top element of the stack
                System.out.println("New top element: " + stack.peek());

                // Check if the stack is empty
                System.out.println("Is the stack empty? " + stack.isEmpty());

                // Print the size of the stack
                System.out.println("Size of stack: " + stack.size());

                break;

            case 2:
                MyCustomQueue<String> queue = new MyCustomQueue<>(); // Create an instance of MyCustomQueue

                // Add elements to the queue
                queue.enqueue("Alice");
                queue.enqueue("Bob");

                // Print the front element of the queue
                System.out.println("Front of queue: " + queue.peek());

                // Print the size of the queue
                System.out.println("Size of queue: " + queue.size());

                // Remove an element from the queue
                System.out.println("Removed from queue: " + queue.dequeue());

                // Print the front element of the queue
                System.out.println("Front of queue: " + queue.peek());

                // Print the size of the queue
                System.out.println("Size of queue: " + queue.size());

                // Add an element to the queue
                queue.enqueue("Charlie");

                // Print the size of the queue
                System.out.println("Size of queue: " + queue.size());

                // Remove all elements from the queue
                while (!queue.isEmpty()) {
                    System.out.println("Removed from queue: " + queue.dequeue());
                }

                break;

            default:
                System.err.print("Invalid input. Please enter 1 (MyCustomStack) or 2 (MyCustomQueue).");
        }
    }
}
