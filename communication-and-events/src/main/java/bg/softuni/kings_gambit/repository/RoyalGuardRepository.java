package bg.softuni.kings_gambit.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bg.softuni.kings_gambit.contract.GambitRepository;
import bg.softuni.kings_gambit.event.GambitPersonDeathEvent;
import bg.softuni.kings_gambit.model.GambitPerson;

public class RoyalGuardRepository implements GambitRepository<GambitPerson> {

    private List<GambitPerson> royalGuards;

    public RoyalGuardRepository() {
        this.royalGuards = new ArrayList<>();
    }

    @Override
    public void addElement(GambitPerson royalGuard) {
        royalGuards.add(royalGuard);
    }

    @Override
    public void removeElement(GambitPerson royalGuard) {
        royalGuards.remove(royalGuard);
    }

    @Override
    public Iterator<GambitPerson> iterator() {
        return royalGuards.iterator();
    }

    @Override
    public void onGambitPersonDeath(GambitPersonDeathEvent deathEvent) {
        royalGuards.remove(deathEvent.getSource());
    }

}
