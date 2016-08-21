package bg.softuni.barracks.core.command;

import bg.softuni.barracks.contract.Inject;
import bg.softuni.barracks.contract.Repository;

public class RetireCommand extends Command {

    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = this.getData()[1];
        try {
            this.repository.removeUnit(unitType);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return String.format("%s retired!", unitType);
    }

}
