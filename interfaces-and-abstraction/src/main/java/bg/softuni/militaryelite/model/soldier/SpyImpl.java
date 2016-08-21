package bg.softuni.militaryelite.model.soldier;

import bg.softuni.militaryelite.model.soldier.contracts.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private long codeNumber;

    public SpyImpl(String id, String firstName, String lastName, long codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public long getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s\nCode Number: %s", getFirstName(), getLastName(), getId(),
                getCodeNumber());
    }
}
