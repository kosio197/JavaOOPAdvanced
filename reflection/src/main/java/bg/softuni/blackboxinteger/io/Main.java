package bg.softuni.blackboxinteger.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import bg.softuni.blackboxinteger.engine.BlackBoxEngine;

public class Main {
    public static void main(String[] args)
            throws IOException, NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BlackBoxEngine bbe = new BlackBoxEngine();
        String command = br.readLine();

        while (!command.equals("END")) {
            Integer result = bbe.executeCommand(command);

            if (result != null) {
                System.out.println(result);
            }
            command = br.readLine();
        }
    }
}
