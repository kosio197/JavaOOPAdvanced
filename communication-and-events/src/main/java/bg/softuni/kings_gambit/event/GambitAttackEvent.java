package bg.softuni.kings_gambit.event;

import java.util.EventObject;

public class GambitAttackEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    public GambitAttackEvent(Object source) {
        super(source);
    }
}
