package bg.softuni.comparing_objects.model;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        setName(name);
        setAge(age);
        setTown(town);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    protected void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person p) {
        if (this.name.compareTo(p.name) > 0) {
            return 1;
        } else if (this.name.compareTo(p.name) < 0) {
            return -1;
        } else if (this.age > p.age) {
            return 1;
        } else if (this.age < p.age) {
            return -1;
        } else
            return this.town.compareTo(p.town);
    }

}
