package bg.softuni.InfernoInfinity.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.InfernoInfinity.gameengine.ProcesGame;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = br.readLine();

        while (!command.equals("END")) {
            String result = ProcesGame.processCommand(command);

            if (result != null) {
                System.out.println(result);
            }

            command = br.readLine();
        }
    }
}
