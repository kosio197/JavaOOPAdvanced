package bg.softuni.kings_gambit.model;

import bg.softuni.kings_gambit.event.GambitAttackEvent;

public class Footman extends GambitPerson {

    private static final int FOOTMANDAMAGEPOINT = 2;
    public Footman(String name) {
        super(name, FOOTMANDAMAGEPOINT);
    }

    @Override
    public String onGambitPersonEvent(GambitAttackEvent event) {
        return String.format("Footman %s is panicking!", super.getName());
    }

}
