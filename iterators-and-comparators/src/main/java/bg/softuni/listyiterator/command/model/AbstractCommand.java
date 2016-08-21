package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.contract.Executable;
import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public abstract class AbstractCommand implements Executable {

    private ListyIteratorRepository repository;

    public AbstractCommand(ListyIteratorRepository repository) {
        this.setRepository(repository);
    }

    public ListyIteratorRepository getRepository() {
        return repository;
    }

    public void setRepository(ListyIteratorRepository repository) {
        this.repository = repository;
    }


    @Override
    public String execute() throws Exception {
        if (!validate(repository)) {
            throw new IllegalArgumentException("Invalid Command!");
        }
        return doExecute();
    }

    protected abstract String doExecute();

    protected abstract boolean validate(ListyIteratorRepository repository2);
}
