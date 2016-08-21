package bg.softuni.strategy_pattern.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

import bg.softuni.strategy_pattern.model.PersonByAge;
import bg.softuni.strategy_pattern.model.PersonByName;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<PersonByName> personByName = new TreeSet<>();
        Set<PersonByAge> personByAge = new TreeSet<>();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String info[] = br.readLine().split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            personByName.add(new PersonByName(name, age));
            personByAge.add(new PersonByAge(name, age));
        }

        for (PersonByName person : personByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        for (PersonByAge person : personByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
