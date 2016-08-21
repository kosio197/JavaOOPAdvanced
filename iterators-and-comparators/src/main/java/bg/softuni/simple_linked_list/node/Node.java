package bg.softuni.simple_linked_list.node;

public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value, Node<T> next) {
        setValue(value);
        setNext(next);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
