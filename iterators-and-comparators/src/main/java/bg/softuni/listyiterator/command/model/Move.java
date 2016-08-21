package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class Move extends AbstractCommand {

    public Move(ListyIteratorRepository repository) {
        super(repository);
    }

    @Override
    protected String doExecute() {
        if (super.getRepository().getIndex() < super.getRepository().getSize() - 1) {
            super.getRepository().setIndex(super.getRepository().getIndex() + 1);
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    protected boolean validate(ListyIteratorRepository repository2) {
        return true;
    }

}
