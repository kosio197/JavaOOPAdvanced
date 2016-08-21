package bg.softuni.listyiterator.command.model;

import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class Create extends AbstractCommand {

    private String[] data;

    public Create(ListyIteratorRepository repository, String[] data) {
        super(repository);
        this.setData(data);
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    protected String doExecute() {
        for (int i = 1; i < data.length; i++) {
            super.getRepository().add(data[i]);
        }
        return null;
    }

    @Override
    protected boolean validate(ListyIteratorRepository repository2) {
        return true;
    }

}
