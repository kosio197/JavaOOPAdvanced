package bg.softuni.birthdaycelebration.city;

import bg.softuni.birthdaycelebration.model.citizen.PersonImpl;
import bg.softuni.birthdaycelebration.model.citizen.PetImpl;
import bg.softuni.birthdaycelebration.model.citizen.RobotImpl;
import bg.softuni.birthdaycelebration.model.citizen.contracts.Citizen;

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
}
