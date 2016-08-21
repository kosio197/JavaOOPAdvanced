package bg.softuni.event_implementation.contract;

import bg.softuni.event_implementation.model.NameChange;

public interface NameChangeListener {

    void handleChangedName(NameChange event);
}
