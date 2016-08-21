package bg.softuni.kings_gambit.contract;

import bg.softuni.kings_gambit.event.GambitPersonDeathEvent;

public interface GambitPersonDeathEventListener {

    void onGambitPersonDeath(GambitPersonDeathEvent deathEvent);
}
