package bg.softuni.foodshortage.model.citizen;

import bg.softuni.foodshortage.model.citizen.contracts.Buyer;
import bg.softuni.foodshortage.model.citizen.contracts.Rebel;

public class RebelImpl extends CitizenImpl implements Rebel, Buyer {
    private String group;
    private int age;
    private int food = 0;

    public RebelImpl(String name, String group, int age) {
        super("unknown", name);
        this.group = group;
        this.age = age;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void buyFood() {
        food +=5;
    }

    @Override
    public int getFood() {
        return food;
    }
}
