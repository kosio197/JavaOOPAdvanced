package bg.softuni.simple_linked_list.contract;

import java.util.List;

public interface SimpleLinkedList<T> {

    void addElement(T t);

    void removeElement(T t);

    int getSize();

    List<T> getAllElement();
}
