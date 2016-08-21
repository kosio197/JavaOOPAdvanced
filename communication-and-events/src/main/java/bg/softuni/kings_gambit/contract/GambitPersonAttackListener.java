package bg.softuni.kings_gambit.contract;

import bg.softuni.kings_gambit.event.GambitAttackEvent;

public interface GambitPersonAttackListener {

    String onGambitPersonEvent(GambitAttackEvent event);
}
