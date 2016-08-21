package bg.softuni.bordercontrol.city;

import bg.softuni.bordercontrol.model.citizen.PersonImpl;
import bg.softuni.bordercontrol.model.citizen.RobotImpl;
import bg.softuni.bordercontrol.model.citizen.contracts.Citizen;

public class CitizenFactory {
    public static Citizen createPerson(String id, String name, int age) {
        return new PersonImpl(id, name, age);
    }

    public static Citizen createRobot(String id, String name) {
        return new RobotImpl(id, name);
    }
}
