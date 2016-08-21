package bg.softuni.kings_gambit.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bg.softuni.kings_gambit.contract.GambitRepository;
import bg.softuni.kings_gambit.event.GambitPersonDeathEvent;
import bg.softuni.kings_gambit.model.GambitPerson;

public class FootmanRepository implements GambitRepository<GambitPerson> {

    private List<GambitPerson> footmans;

    public FootmanRepository() {
        this.footmans = new ArrayList<>();
    }

    @Override
    public void addElement(GambitPerson footman) {
        footmans.add(footman);
    }

    @Override
    public void removeElement(GambitPerson footman) {
        footmans.remove(footman);
    }

    @Override
    public Iterator<GambitPerson> iterator() {
        return footmans.iterator();
    }

    @Override
    public void onGambitPersonDeath(GambitPersonDeathEvent deathEvent) {
        footmans.remove(deathEvent.getSource());
    }

}

