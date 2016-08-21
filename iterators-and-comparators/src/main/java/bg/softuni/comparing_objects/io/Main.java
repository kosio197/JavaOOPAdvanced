package bg.softuni.comparing_objects.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.comparing_objects.model.Person;
import bg.softuni.comparing_objects.repository.PersonRepository;

public class Main {
    public static void main(String[] args) throws IOException {

        PersonRepository repository = new PersonRepository();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String info = br.readLine();
        while (!info.equals("END")) {

            String[] data = info.split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1].trim()), data[2]);
            repository.addPerson(person);

            info = br.readLine();
        }

        int index = Integer.valueOf(br.readLine().trim());
        int equalsPerson = 0;
        int notEqualsPerson = 0;

        try {
            equalsPerson = repository.getEquals(index);
            notEqualsPerson = repository.getSize() - equalsPerson;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("%d %d %d", equalsPerson, notEqualsPerson, repository.getSize());
    }
}
