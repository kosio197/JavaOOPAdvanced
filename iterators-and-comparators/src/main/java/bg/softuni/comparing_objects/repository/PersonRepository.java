package bg.softuni.comparing_objects.repository;

import java.util.ArrayList;
import java.util.List;

import bg.softuni.comparing_objects.model.Person;

public class PersonRepository {

    private List<Person> persons;

    public PersonRepository() {
        setPersons();
    }

    public List<Person> getPersons() {
        return persons;
    }

    protected void setPersons() {
        this.persons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public int getSize() {
        return persons.size();
    }

    // private void sortCollection() {
    // Collections.sort(persons);
    // }

    public int getEquals(int index) {
        if (index > getSize() - 1) {
            throw new IllegalArgumentException("No matches");
        }

        // sortCollection();

        Person person = persons.get(index);
        int result = 0;
        for (Person p : persons) {
            if (p.compareTo(person) == 0) {
                result++;
            }
        }

        return result;
    }
}
