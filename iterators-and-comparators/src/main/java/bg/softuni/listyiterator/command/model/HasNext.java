package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class HasNext extends AbstractCommand {

    public HasNext(ListyIteratorRepository repository) {
        super(repository);
    }

    @Override
    protected String doExecute() {
        return String.valueOf(super.getRepository().hasNext());
    }

    @Override
    protected boolean validate(ListyIteratorRepository repository2) {
        return true;
    }

}
