package bg.softuni.stack_iterator.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import bg.softuni.stack_iterator.contract.StackRepository;

public class Repository implements StackRepository {

    private List<Integer> list;
    private int index;

    public Repository() {
        setList();
        setIndex(-1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        if (this.index >= 0) {
            return true;
        }
        setIndex(list.size() - 1);
        return false;
    }

    @Override
    public Integer next() {
        setIndex(getIndex() - 1);
        return this.list.get(this.index + 1);
    }

    @Override
    public void addElement(int next) {
        setIndex(this.index + 1);
        this.list.add(next);
    }

    @Override
    public void removeElement() {
        if (this.list.size() > 0) {
            this.list.remove(this.list.size() - 1);
            setIndex(this.index - 1);
        }
    }

    @Override
    public List<Integer> getAllElement() {
        return Collections.unmodifiableList(list);
    }


    private void setList() {
        this.list = new ArrayList<>();
    }

    private int getIndex() {
        return index;
    }

    private void setIndex(int index) {
        this.index = index;
    }

}
