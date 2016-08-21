package bg.softuni.stack_iterator.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import bg.softuni.stack_iterator.contract.CommandInterpreter;

public class Main {
    public static void main(String[] args) throws IOException {

        CommandInterpreter interpreter = new CommandTranslator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = br.readLine();

        while (!command.equals("END")) {
            if (command != null || command != "") {
                try {
                    interpreter.processCommand(command);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
            }

            command = br.readLine();
        }
        br.close();

        List<Integer> result = interpreter.getAllElements(command);

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

}
