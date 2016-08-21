package bg.softuni.stack_iterator.contract;

import java.util.List;

public interface CommandInterpreter {

    void processCommand(String command);

    List<Integer> getAllElements(String command);

}
