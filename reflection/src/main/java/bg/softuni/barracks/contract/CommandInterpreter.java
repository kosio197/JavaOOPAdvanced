package bg.softuni.barracks.contract;


public interface CommandInterpreter {
    Executable interpretCommand(String[] data, String commandName);
}
