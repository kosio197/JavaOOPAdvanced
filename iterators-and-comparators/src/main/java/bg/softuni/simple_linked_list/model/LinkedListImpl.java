package bg.softuni.simple_linked_list.model;

import java.util.ArrayList;
import java.util.List;

import bg.softuni.simple_linked_list.contract.SimpleLinkedList;
import bg.softuni.simple_linked_list.node.Node;

public class LinkedListImpl<T> implements SimpleLinkedList<T> {

    private Node<T> head;

    @Override
    public void addElement(T t) {
        Node<T> nextNode = new Node<T>(t, null);

        if (head == null) {
            head = nextNode;

        } else {
            Node<T> temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nextNode);
        }
    }

    @Override
    public void removeElement(T t) {
        if (head.getValue().equals(t)) {
            head = head.getNext();
            return;
        }

        Node<T> temp = head;

        while (temp.getNext() != null) {
            if (temp.getNext().getValue().equals(t)) {
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
    }

    @Override
    public int getSize() {
        int result = 0;

        Node<T> temp = head;

        while (temp.getNext() != null) {
            result++;
            temp = temp.getNext();
        }

        if (temp != null) {
            result++; // last node
        }

        return result;
    }

    @Override
    public List<T> getAllElement() {
        List<T> result = new ArrayList<>();
        Node<T> temp = head;

        while (temp.getNext() != null) {
            result.add(temp.getValue());
            temp = temp.getNext();
        }

        if (temp != null) {
            result.add(temp.getValue());
        }

        return result;
    }

}
