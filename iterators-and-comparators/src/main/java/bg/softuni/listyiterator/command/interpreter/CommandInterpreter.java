package bg.softuni.listyiterator.command.interpreter;

import bg.softuni.listyiterator.command.model.Create;
import bg.softuni.listyiterator.command.model.HasNext;
import bg.softuni.listyiterator.command.model.Move;
import bg.softuni.listyiterator.command.model.Print;
import bg.softuni.listyiterator.command.model.PrintAll;
import bg.softuni.listyiterator.contract.Executable;
import bg.softuni.listyiterator.repository.ListyIteratorRepository;

public class CommandInterpreter {

    private ListyIteratorRepository repository;

    public CommandInterpreter() {
        this.repository = new ListyIteratorRepository();
    }

    public String interpretCommand(String input) throws Exception {
        String result = null;
        String data[] = null;
        if (input.indexOf(" ") > 0) {
            data = input.split("\\s+");
        } else {
            data = new String[1];
            data[0] = input;
        }

        Executable command = parseCommand(data);
        if (command != null) {
            result = command.execute();
        }
        return result;
    }


    private Executable parseCommand(String[] data) {
        switch (data[0]) {
            case "Create":
                return new Create(repository, data);
            case "Move":
                return new Move(repository);
            case "HasNext":
                return new HasNext(repository);
            case "Print":
                return new Print(repository);
            case "PrintAll":
                return new PrintAll(repository);
            default:
                break;
        }
        return null;
    }


}
