# Assignment 3

This repository contains Java code for implementing two data structures: a stack and a queue using linked lists.

## MyStack<E>

The `MyStack<E>` class is a generic class that implements a stack data structure using a linked list. It has the following methods:

### `public MyStack()`

This is the constructor for the `MyStack<E>` class. It initializes a new, empty stack.

### `public void push(E element)`

This method adds an element to the top of the stack.

- `element`: the element to be added to the stack

### `public E peek()`

This method returns the element at the top of the stack without removing it.

- Returns: the element at the top of the stack

### `public boolean isEmpty()`

This method checks if the stack is empty.

- Returns: `true` if the stack is empty, `false` otherwise

### `public int size()`

This method returns the number of elements in the stack.

- Returns: the number of elements in the stack

### `public E pop()`

This method removes and returns the element at the top of the stack.

- Returns: the element at the top of the stack

## MyQueue<E>

The `MyQueue<E>` class is a generic class that implements a queue data structure using a linked list. It has the following methods:

### `public MyQueue()`

This is the constructor for the `MyQueue<E>` class. It initializes a new, empty queue.

### `public void enqueue(E element)`

This method adds an element to the end of the queue.

- `element`: the element to be added to the queue

### `public E dequeue()`

This method removes and returns the element at the front of the queue.

- Returns: the element at the front of the queue

### `public boolean isEmpty()`

This method checks if the queue is empty.

- Returns: `true` if the queue is empty, `false` otherwise

### `public int size()`

This method returns the number of elements in the queue.

- Returns: the number of elements in the queue

### `public E peek()`

This method returns the element at the front of the queue without removing it.

- Returns: the element at the front of the queue

## Usage

To use the `MyStack<E>` and `MyQueue<E>` classes, first create an object of the appropriate class, passing in the appropriate type parameter. Then, call the appropriate methods to add, remove, or inspect elements.

Here is an example usage of the `MyStack<E>` class:

```
MyStack<String> stack = new MyStack<>();
stack.push("Hello");
stack.push("world");
System.out.println(stack.peek());
stack.pop();
System.out.println(stack.peek());
System.out.println(stack.isEmpty());
System.out.println(stack.size());
```

And here is an example usage of the `MyQueue<E>` class:

```
MyQueue<String> queue = new MyQueue<>();
queue.enqueue("Alice");
queue.enqueue("Bob");
System.out.println(queue.peek());
System.out.println(queue.size());
System.out.println(queue.dequeue());
```
