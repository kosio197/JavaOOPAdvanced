package bg.softuni.event_implementation.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.event_implementation.model.Dispatcher;
import bg.softuni.event_implementation.model.Handler;

public class Main {

    public static void main(String[] args) throws IOException {

        Dispatcher dispatcher = new Dispatcher();
        Handler handler = new Handler();
        dispatcher.addNameChangeListener(handler);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        while (!name.equals("End")) {
            dispatcher.setName(name);
            name = br.readLine();
        }
        br.close();
    }
}
