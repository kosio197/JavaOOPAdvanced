package bg.softuni.militaryelite.model.soldier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bg.softuni.militaryelite.model.soldier.contracts.LeutenantGeneral;
import bg.softuni.militaryelite.model.soldier.contracts.Private;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {

    private List<Private> privates;

    public LeutenantGeneralImpl(String id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public List<Private> getPrivates() {
        return Collections.unmodifiableList(privates);
    }

    @Override
    public void addPrivates(Private privateSoldier) {
        this.privates.add(privateSoldier);
    }
}
