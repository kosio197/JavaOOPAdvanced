package bg.softuni.militaryelite.model.soldier.contracts;

import java.util.List;

import bg.softuni.militaryelite.model.contracts.Mission;

public interface Commando extends SpecialisedSoldier {
    List<Mission> getMisions();
    void addMisions(Mission mision);
}
