package bg.softuni.event_implementation.model;

import java.util.EventObject;

public class NameChange extends EventObject {
    private static final long serialVersionUID = 1L;

    private String changedName;

    public NameChange(Object source, String name) {
        super(source);
        setChangedName(name);
    }

    public String getChangedName() {
        return changedName;
    }

    public void setChangedName(String changedName) {
        this.changedName = changedName;
    }

}
