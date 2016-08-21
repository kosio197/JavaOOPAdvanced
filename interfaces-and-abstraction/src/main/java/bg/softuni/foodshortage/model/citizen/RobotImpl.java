package bg.softuni.foodshortage.model.citizen;

import bg.softuni.foodshortage.model.citizen.contracts.Robot;

public class RobotImpl extends CitizenImpl implements Robot {

    public RobotImpl(String id, String name) {
        super(id, name);
    }

}
