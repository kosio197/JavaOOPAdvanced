package bg.softuni.harvestingfields.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.harvestingfields.engine.HarvestingFieldsEngine;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HarvestingFieldsEngine engine = new HarvestingFieldsEngine();

        String command = br.readLine();

        while (!command.equals("HARVEST")) {

            String result = engine.processCommand(command);

            if (result != null) {
                System.out.print(result);
            }
            command = br.readLine();
        }

    }
}
