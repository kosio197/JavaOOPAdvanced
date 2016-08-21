package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class Print extends AbstractCommand {

    public Print(ListyIteratorRepository repository) {
        super(repository);
    }

    @Override
    protected String doExecute() {
        return super.getRepository().getElement(super.getRepository().getIndex());
    }

    @Override
    protected boolean validate(ListyIteratorRepository repository2) {
        if (super.getRepository().getSize() == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        return true;
    }

}
