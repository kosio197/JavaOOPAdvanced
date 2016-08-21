package bg.softuni.stack_iterator.model;

import bg.softuni.stack_iterator.contract.Execute;
import bg.softuni.stack_iterator.repository.Repository;

public class StackPop implements Execute {

    private Repository repository;

    public StackPop(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        if (!repository.hasNext()) {
            throw new ArrayIndexOutOfBoundsException("No elements");
        }

        this.repository.removeElement();
    }

}
