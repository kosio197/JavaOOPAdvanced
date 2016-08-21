package bg.softuni.barracks.core.command;

import bg.softuni.barracks.contract.Inject;
import bg.softuni.barracks.contract.Repository;

public class ReportCommand extends Command {

    @Inject
    private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }

}
