package bg.softuni.event_implementation.model;

import java.util.ArrayList;
import java.util.List;

import bg.softuni.event_implementation.contract.NameChangeListener;

public class Dispatcher {

    private String name;
    private List<NameChangeListener> changeListener;

    public Dispatcher() {
        this.changeListener = new ArrayList<>();
    }

    public void addNameChangeListener(NameChangeListener handler) {
        changeListener.add(handler);
    }

    public void removeNameChangeListener(NameChangeListener name) {
        changeListener.remove(name);
    }

    private void fireNameChangeEvent() {
        for (NameChangeListener nameChangeListener : changeListener) {
            nameChangeListener.handleChangedName(new NameChange(this, getName()));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        fireNameChangeEvent();
    }
}
