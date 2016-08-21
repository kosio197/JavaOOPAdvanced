package bg.softuni.kings_gambit.model;

import bg.softuni.kings_gambit.event.GambitAttackEvent;

public class RoyalGuard extends GambitPerson {

    private static final int ROYALGUARDDAMAGEPOINT = 3;
    public RoyalGuard(String name) {
        super(name, ROYALGUARDDAMAGEPOINT);
    }

    @Override
    public String onGambitPersonEvent(GambitAttackEvent event) {
        return String.format("Royal Guard %s is defending!", super.getName());
    }
}
