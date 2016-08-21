package bg.softuni.foodshortage.city;

import bg.softuni.foodshortage.model.citizen.PersonImpl;
import bg.softuni.foodshortage.model.citizen.PetImpl;
import bg.softuni.foodshortage.model.citizen.RebelImpl;
import bg.softuni.foodshortage.model.citizen.RobotImpl;
import bg.softuni.foodshortage.model.citizen.contracts.Citizen;

public class CitizenFactory {
    public static Citizen createPerson(String id, String name, int age, String birthday) {
        return new PersonImpl(id, name, age, birthday);
    }

    public static Citizen createRobot(String id, String name) {
        return new RobotImpl(id, name);
    }

    public static Citizen createPet(String name, String birthday) {
        return new PetImpl(name, birthday);
    }

    public static Citizen createRebel(String name, String group, int age) {
        return new RebelImpl(name, group, age);
    }
}
