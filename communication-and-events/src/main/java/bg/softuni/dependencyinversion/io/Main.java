package bg.softuni.dependencyinversion.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import bg.softuni.dependencyinversion.calculator.PrimitiveCalculator;
import bg.softuni.dependencyinversion.contract.Strategy;
import bg.softuni.dependencyinversion.model.AdditionStrategy;
import bg.softuni.dependencyinversion.model.DividingStrategy;
import bg.softuni.dependencyinversion.model.MultiplyStrategy;
import bg.softuni.dependencyinversion.model.SubtractionStrategy;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Strategy> strategies = new HashMap<>();
        strategies.put("+", new AdditionStrategy());
        strategies.put("-", new SubtractionStrategy());
        strategies.put("*", new MultiplyStrategy());
        strategies.put("/", new DividingStrategy());

        PrimitiveCalculator calculator = new PrimitiveCalculator();

        String command = br.readLine();
        while (!command.equals("End")) {
            String info[] = command.split("\\s+");

            if (info[0].equals("mode")) {
                calculator.changeStraategy(strategies.get(info[1]));
            } else {
                System.out.println(calculator.doCalculate(Double.parseDouble(info[0]), Double.parseDouble(info[1])));
            }

            command = br.readLine();
        }
        br.close();
    }
}
