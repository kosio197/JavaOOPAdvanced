package bg.softuni.pet_clinics.model;

public class Pet {

    private String name;
    private int age;
    private String kind;

    public Pet(String name, int age, String kind) {
        setName(name);
        setAge(age);
        setKind(kind);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", getName(), getAge(), getKind());
    }
}
