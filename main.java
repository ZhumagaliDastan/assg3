import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.print("Please choose an option (1 = MyCustomStack, 2 = MyCustomQueue): ");
        int userInput = scanner.nextInt(); // User's input

        switch (userInput) {
            case 1:
                MyCustomStack<String> stack = new MyCustomStack<>();

                stack.push("Hello"); // Push "Hello" to the stack

                stack.push("World!"); // Push "World!" to the stack

                System.out.println("Top element: " + stack.peek()); // Output: "World!", print the top element of the stack

                stack.pop(); // Remove the top element of the stack

                System.out.println("New top element: " + stack.peek()); // Output: "Hello", print the new top element of the stack

                System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false, check if the stack is empty

                System.out.println("Size of stack: " + stack.size()); // Output: 1, print the size of the stack

                break;

            case 2:
                MyCustomQueue<String> queue = new MyCustomQueue<>();

                queue.enqueue("Alice"); // Add Alice to the queue

                queue.enqueue("Bob"); // Add Bob to the queue

                System.out.println("Front of queue: " + queue.peek()); // Output: Front of queue: Alice

                System.out.println("Size of queue: " + queue.size()); // Output: Queue size: 2

                System.out.println("Removed from queue: " + queue.dequeue()); // Output: Removed from queue: Alice

                System.out.println("Front of queue: " + queue.peek()); // Output: Front of queue: Bob

                System.out.println("Size of queue: " + queue.size()); // Output: Queue size: 1

                queue.enqueue("Charlie"); // Add Charlie to the queue

                System.out.println("Size of queue: " + queue.size()); // Output: Queue size: 2

                // Remove all elements from the queue.
                while (!queue.isEmpty()) {
                    System.out.println("Removed from queue: " + queue.dequeue());
                }
                // Output:
                // Removed from queue: Bob
                // Removed from queue: Charlie

                break;

            default:
                System.err.print("Invalid input. Please enter 1 (MyCustomStack) or 2 (MyCustomQueue).");
        }
    }
}
