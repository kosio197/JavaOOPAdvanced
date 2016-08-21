package bg.softuni.militaryelite.model.soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bg.softuni.militaryelite.model.contracts.Repair;
import bg.softuni.militaryelite.model.soldier.contracts.Engineer;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private List<Repair> repairs;

    public EngineerImpl(String id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public List<Repair> getRepairs() {
        return Collections.unmodifiableList(repairs);
    }

    @Override
    public void addRepairs(Repair repair) {
        this.repairs.add(repair);
    }
}
