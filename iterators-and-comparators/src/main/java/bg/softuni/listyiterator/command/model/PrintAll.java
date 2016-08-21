package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class PrintAll extends AbstractCommand {

    public PrintAll(ListyIteratorRepository repository) {
        super(repository);
    }

    @Override
    protected String doExecute() {
        if (super.getRepository().getSize() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < super.getRepository().getSize(); i++) {
            sb.append(super.getRepository().getElement(i));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    protected boolean validate(ListyIteratorRepository repository2) {
        return true;
    }

}
