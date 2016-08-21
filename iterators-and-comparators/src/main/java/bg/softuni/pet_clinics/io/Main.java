package bg.softuni.pet_clinics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CommandInterpreter interpreter = new CommandInterpreter();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            try {
                String command = br.readLine();
                String result = interpreter.executeCommand(command);

                if (result != null) {
                    System.out.println(result);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
