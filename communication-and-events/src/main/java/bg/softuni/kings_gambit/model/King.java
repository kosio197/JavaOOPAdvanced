package bg.softuni.kings_gambit.model;

import bg.softuni.kings_gambit.event.GambitAttackEvent;

public class King extends GambitPerson {

    private static final int KINGDAMAGEPOINT = 1;
    public King(String name) {
        super(name, KINGDAMAGEPOINT);
    }

    @Override
    public String onGambitPersonEvent(GambitAttackEvent event) {
        return String.format("King %s is under attack!", super.getName());
    }
}
