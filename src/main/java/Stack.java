import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private class Node {
        private T value;
        private Node next;

        public Node(T val, Node last) {
            value = val;
            next = last;
        }
        public T getValue() {
            return value;
        }
        public Node getNext() {
            return next;
        }
    }

    private Node top;

    private class StackIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return ( top != null ) ;
        }

        @Override
        public T next() {
            T ret = top.getValue();
            top = top.getNext();
            return ret;
        }

        @Override
        public void remove() {

        }

    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    void push(T value) {
        top = new Node(value, top);
    }
}

