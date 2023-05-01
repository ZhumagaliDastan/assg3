import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListQueue<E> implements Queue<E> {
    private LinkedList<E> queue;
    
    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
    
    @Override
    public boolean add(E element) {
        return queue.add(element);
    }
    
    @Override
    public boolean offer(E element) {
        return queue.offer(element);
    }
    
    @Override
    public E remove() {
        if (ifIsEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove();
    }
    
    @Override
    public E poll() {
        return queue.poll();
    }
    
    @Override
    public E element() {
        if (ifIsEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.element();
    }
    
    @Override
    public E peek() {
        return queue.peek();
    }
    
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    @Override
    public int size() {
        return queue.size();
    }
    
    @Override
    public boolean contains(Object element) {
        return queue.contains(element);
    }
    
    @Override
    public Iterator<E> iterator() {
        return queue.iterator();
    }
    
    @Override
    public Object[] toArray() {
        return queue.toArray();
    }
    
    @Override
    public <T> T[] toArray(T[] a) {
        return queue.toArray(a);
    }
    
    @Override
    public boolean remove(Object element) {
        return queue.remove(element);
    }
    
    @Override
    public boolean containsAll(Collection<?> c) {
        return queue.containsAll(c);
    }
    
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return queue.addAll(c);
    }
    
    @Override
    public boolean removeAll(Collection<?> c) {
        return queue.removeAll(c);
    }
    
    @Override
    public boolean retainAll(Collection<?> c) {
        return queue.retainAll(c);
    }
    
    @Override
    public void clear() {
        queue.clear();
    }
}
