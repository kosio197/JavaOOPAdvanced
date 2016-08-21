package bg.softuni.barracks.core.command;

import bg.softuni.barracks.contract.Executable;
import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return data;
    }
}
