package bg.softuni.listyiterator.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import bg.softuni.listyiterator.command.interpreter.CommandInterpreter;

public class Main {
    public static void main(String[] args) throws Exception {

        CommandInterpreter interpreter = new CommandInterpreter();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = br.readLine();

        while (!command.equals("END")) {
            String result = null;
            try {
                result = interpreter.interpretCommand(command);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (result != null) {
                System.out.println(result);
            }

            command = br.readLine();
        }
    }
}
