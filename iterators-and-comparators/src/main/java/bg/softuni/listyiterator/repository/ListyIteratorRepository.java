package bg.softuni.listyiterator.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIteratorRepository implements Iterator<String>, Iterable<String> {

    private List<String> list;
    private int index;

    public ListyIteratorRepository() {
        this.list = new ArrayList<>();
        this.index = 0;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void add(String string) {
        this.list.add(string);
    }

    public int getSize() {
        return list.size();
    }

    public String getElement(int index2) {
        return list.get(index2);
    }

    @Override
    public boolean hasNext() {
        return this.index < this.getSize() - 1;
    }

    @Override
    public String next() {
        this.setIndex(this.index + 1);
        return this.list.get(this.index - 1);
    }

    @Override
    public Iterator<String> iterator() {
        return this;
    }

}
