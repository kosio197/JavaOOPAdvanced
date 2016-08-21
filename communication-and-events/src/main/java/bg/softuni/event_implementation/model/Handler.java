package bg.softuni.event_implementation.model;

import bg.softuni.event_implementation.contract.NameChangeListener;

public class Handler implements NameChangeListener {


    @Override
    public void handleChangedName(NameChange event) {

        System.out.println("Dispatcher's name changed to " + event.getChangedName() + ".");
    }

}
