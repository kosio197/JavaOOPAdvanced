package bg.softuni.bordercontrol.model.citizen;

import bg.softuni.bordercontrol.model.citizen.contracts.Person;

public class PersonImpl extends CitizenImpl implements Person {
    private int age;

    public PersonImpl(String id, String name, int age) {
        super(id, name);

        this.setAge(age);
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
