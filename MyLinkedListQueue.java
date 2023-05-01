import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListQueue<E> implements Queue<E> {
    private LinkedList<E> queue; // instance variable of type LinkedList

    // Constructor to initialize the instance variable as a new empty LinkedList
    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
    
    // Adds the specified element to the queue
    @Override
    public boolean add(E element) {
        return queue.add(element);
    }
    
    // Adds the specified element to the queue
    @Override
    public boolean offer(E element) {
        return queue.offer(element);
    }
    
    // Removes and returns the head of the queue
    @Override
    public E remove() {
        if (ifIsEmpty()) { // checks if queue is empty
            throw new NoSuchElementException(); // throws an exception if empty
        }
        return queue.remove();
    }
    
    // Retrieves and removes the head of the queue, or returns null if the queue is empty
    @Override
    public E poll() {
        return queue.poll();
    }
    
    // Retrieves, but does not remove, the head of the queue
    @Override
    public E element() {
        if (ifIsEmpty()) { // checks if queue is empty
            throw new NoSuchElementException(); // throws an exception if empty
        }
        return queue.element();
    }
    
    // Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty
    @Override
    public E peek() {
        return queue.peek();
    }
    
    // Returns true if the queue is empty, false otherwise
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // Returns the number of elements in the queue
    @Override
    public int size() {
        return queue.size();
    }
    
    // Returns true if the queue contains the specified element, false otherwise
    @Override
    public boolean contains(Object element) {
        return queue.contains(element);
    }
    
    // Returns an iterator over the elements in the queue
    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }
    
    // Returns an array containing all of the elements in the queue
    @Override
    public Object[] toArray() {
        return queue.toArray();
    }
    
    // Returns an array containing all of the elements in the queue
    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }
    
    // Removes the specified element from the queue
    @Override
    public boolean remove(Object element) {
        return queue.remove(element);
    }
    
    // Returns true if the queue contains all of the elements in the specified collection, false otherwise
    @Override
    public boolean containsAll(Collection<?> c) {
        return queue.containsAll(c);
    }
    
    // Adds all of the elements in the specified collection to the queue
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return queue.addAll(c);
    }
    
    // Removes all of the elements in the specified collection from the queue
    @Override
    public boolean removeAll(Collection<?> c) {
        return queue.removeAll(c);
    }
    
    // Retains only the elements in the queue that are contained in the specified collection
    @Override
    public boolean retainAll(Collection<?> c) {
        return queue.retainAll(c);
    }
    
    // Removes all elements from the queue
    @Override
    public void clear() {
        queue.clear();
    }
}
