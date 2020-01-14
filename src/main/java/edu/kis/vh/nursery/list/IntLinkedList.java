package edu.kis.vh.nursery.list;
/**
* Simple class represents linked list. It can contain integers.
* */
public class IntLinkedList {

    private Node last;
    public static final int EMPTY_LIST = -1;

    /**
     * Add element to the end of the list.
     * @param i element
     * */
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }
    /**
     * Check if list is empty.
     * Returns true if list is empty, else returns false
     * */
    public boolean isEmpty() {
        return getLast() == null;
    }
    /**
     * Check if list is full.
     * Returns true if list is full else returns false
     * */
    public boolean isFull() {
        return false;
    }
    /**
     * Take last element from list without deleting it.
     * Returns top element
     * */
    public int top() {
        if (isEmpty())
            return EMPTY_LIST;
        return getLast().getValue();
    }
    /**
     * Delete and return last element from list.
     * If list is empty returns -1
     * */
    public int pop() {
        if (isEmpty())
            return EMPTY_LIST;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }
    /**
     * Returns last node from list.
     * */
    public Node getLast() {
        return last;
    }

    /**
     * Set last node.
     * */
    public void setLast(Node last) {
        this.last = last;
    }
}
