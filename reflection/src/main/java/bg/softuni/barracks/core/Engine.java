package bg.softuni.barracks.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.barracks.contract.CommandInterpreter;
import bg.softuni.barracks.contract.Executable;
import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.UnitFactory;

public class Engine implements Runnable {


    private Repository repository;
    private UnitFactory unitFactory;

    public Engine(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpredCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private String interpredCommand(String[] data, String commandName) throws ClassNotFoundException {
        CommandInterpreter interpreter = new CommandInterpreterImpl(repository, unitFactory);
        Executable command = interpreter.interpretCommand(data, commandName);

        return command.execute();
    }

}
