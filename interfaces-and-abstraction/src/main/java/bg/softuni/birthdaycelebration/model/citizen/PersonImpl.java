package bg.softuni.birthdaycelebration.model.citizen;

import bg.softuni.birthdaycelebration.model.citizen.contracts.Person;

public class PersonImpl extends CitizenImpl implements Person {
    private int age;
    private String birthday;

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
}
