package bg.softuni.barracks.core.command;

import bg.softuni.barracks.contract.Inject;
import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.Unit;
import bg.softuni.barracks.contract.UnitFactory;

public class AddCommand extends Command {

    @Inject
    private Repository repository;
    @Inject
    private UnitFactory unitFactory;

    public AddCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        Unit unit = this.unitFactory.createUnit(unitType);
        this.repository.addUnit(unit);

        return String.format("%s added!", unitType);
    }

}
