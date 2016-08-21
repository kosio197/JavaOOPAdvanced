package bg.softuni.foodshortage.model.citizen;

import bg.softuni.foodshortage.model.citizen.contracts.Buyer;
import bg.softuni.foodshortage.model.citizen.contracts.Person;

public class PersonImpl extends CitizenImpl implements Person, Buyer {
    private int age;
    private String birthday;
    private int food;

    public PersonImpl(String id, String name, int age, String birthday) {
        super(id, name);

        this.setAge(age);
        this.birthday = birthday;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthday() {
        return birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
