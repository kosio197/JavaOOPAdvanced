package bg.softuni.frog.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bg.softuni.frog.contract.HasJump;

public class Lake implements Iterable<Long>, HasJump {

    private Frog frog;
    private List<Long> list;

    public Lake(List<Long> list) {
        this.list = list;
        this.frog = new Frog(list);
    }

    protected List<Long> getList() {
        return list;
    }

    protected void setList(List<Long> list) {
        this.list = list;
    }

    @Override
    public Iterator<Long> iterator() {
        return this.frog;
    }

    @Override
    public List<Long> getResult() {
        List<Long> result = new ArrayList<>();

        for (long l : frog) {
            result.add(l);
        }

        list.remove(0);
        frog.setList(list);

        for (long l : frog) {
            result.add(l);
        }

        return result;
    }
}
