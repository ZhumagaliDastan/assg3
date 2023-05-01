import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack() {
        stack = new LinkedList<>();
    }

    public void push(E element) {
        stack.addFirst(element);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
}

public class MyQueue<E> {
    private LinkedList<E> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(E element) {
        queue.addLast(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("You!");
        System.out.println("peek: " + stack.peek());
        stack.pop();
        System.out.println("peek: " + stack.peek());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("size: " + stack.size());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        System.out.println("peek: " + queue.peek());
        System.out.println("size: " + queue.size());
        System.out.println("removed: " + queue.dequeue());
        System.out.println("peek: " + queue.peek());
        System.out.println("size: " + queue.size());
        queue.enqueue("Alibek");
        System.out.println("size: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println("removed: " + queue.dequeue());
        }
    }
}
