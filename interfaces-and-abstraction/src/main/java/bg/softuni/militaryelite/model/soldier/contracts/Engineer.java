package bg.softuni.militaryelite.model.soldier.contracts;

import java.util.List;

import bg.softuni.militaryelite.model.contracts.Repair;

public interface Engineer extends SpecialisedSoldier {
    List<Repair> getRepairs();
    void addRepairs(Repair repairs);
}
