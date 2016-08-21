package bg.softuni.stack_iterator.contract;

import java.util.Iterator;
import java.util.List;

public interface StackRepository extends Iterable<Integer>, Iterator<Integer> {

    void addElement(int next);

    void removeElement();

    List<Integer> getAllElement();
}
