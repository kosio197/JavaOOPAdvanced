package bg.softuni.frog.model;

import java.util.Iterator;
import java.util.List;

public class Frog implements Iterator<Long>, Iterable<Long> {

    private List<Long> list;
    private int index;

    public Frog(List<Long> list) {
        this.list = list;
        setIndex(0);
    }

    public List<Long> getList() {
        return list;
    }

    public void setList(List<Long> list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if (this.index < list.size()) {

            return true;
        }
        setIndex(0);
        return false;
    }

    @Override
    public Long next() {
        int tempIndex = index;
        setIndex(this.index + 2);
        return this.list.get(tempIndex);
    }

    @Override
    public Iterator<Long> iterator() {
        return this;
    }
}
