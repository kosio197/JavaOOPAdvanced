package bg.softuni.kings_gambit.event;

import java.util.EventObject;

import bg.softuni.kings_gambit.model.GambitPerson;

public class GambitPersonDeathEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    public GambitPersonDeathEvent(GambitPerson source) {
        super(source);
    }

}
