package bg.softuni.workforce.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.workforce.commandinterpreter.WorkForceCommandInterpreter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        WorkForceCommandInterpreter interpreter = new WorkForceCommandInterpreter();

        String command = br.readLine();
        while (!command.equals("End")) {

            String result = interpreter.executeCommand(command);
            if (result != null) {
                System.out.print(result);
            }

            command = br.readLine();
        }
    }
}
