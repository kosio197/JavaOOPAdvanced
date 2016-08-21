package bg.softuni.stack_iterator.model;

import java.util.List;

import bg.softuni.stack_iterator.contract.Execute;
import bg.softuni.stack_iterator.repository.Repository;

public class StackPush implements Execute {

    private Repository repository;
    private List<Integer> elements;

    public StackPush(Repository repository, List<Integer> elements) {
        this.repository = repository;
        this.elements = elements;
    }

    @Override
    public void execute() {
        for (Integer integer : elements) {
            repository.addElement(integer);
        }
    }

}
