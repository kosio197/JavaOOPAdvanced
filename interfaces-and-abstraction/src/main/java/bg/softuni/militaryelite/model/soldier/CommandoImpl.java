package bg.softuni.militaryelite.model.soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bg.softuni.militaryelite.model.contracts.Mission;
import bg.softuni.militaryelite.model.soldier.contracts.Commando;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private List<Mission> misions;

    public CommandoImpl(String id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.misions = new ArrayList<>();
    }

    @Override
    public List<Mission> getMisions() {
        return Collections.unmodifiableList(misions);
    }

    @Override
    public void addMisions(Mission mision) {
        this.misions.add(mision);
    }


}
