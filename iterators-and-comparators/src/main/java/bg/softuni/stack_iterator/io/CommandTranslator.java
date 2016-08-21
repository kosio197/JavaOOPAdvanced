package bg.softuni.stack_iterator.io;

import java.util.ArrayList;
import java.util.List;

import bg.softuni.stack_iterator.contract.CommandInterpreter;
import bg.softuni.stack_iterator.model.StackPop;
import bg.softuni.stack_iterator.model.StackPush;
import bg.softuni.stack_iterator.repository.Repository;

public class CommandTranslator implements CommandInterpreter {

    private Repository repository;

    public CommandTranslator() {
        this.repository = new Repository();
    }

    @Override
    public void processCommand(String command) {

        if (command.startsWith("Pop")) {
            try {
                StackPop pop = new StackPop(repository);
                pop.execute();

            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }

        } else if (command.startsWith("Push")) {
            List<Integer> elements = new ArrayList<>();
            try {
                String data[] = command.split(",");
                elements.add(Integer.parseInt(data[0].split(" ")[1].trim()));
                for (int i = 1; i < data.length; i++) {
                    elements.add(Integer.parseInt(data[i].trim()));
                }

            } catch (Exception e) {
                // Noting to do
                return;
            }

            StackPush push = new StackPush(repository, elements);
            push.execute();

        } else {
            throw new IllegalArgumentException("Invalid command: " + command);
        }

    }

    @Override
    public List<Integer> getAllElements(String command) {
        if (!command.equals("END")) {
            return null; // or throw IllegalArgumentException("Invalid command:
                         // " + command)
        }
        List<Integer> result = new ArrayList<>();

        for (Integer i : repository) {
            result.add(i);
        }
        for (Integer i : repository) {
            result.add(i);
        }
        return result;
    }

}
