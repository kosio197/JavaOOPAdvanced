package bg.softuni.bordercontrol.model.citizen;

import bg.softuni.bordercontrol.model.citizen.contracts.Robot;

public class RobotImpl extends CitizenImpl implements Robot {

    public RobotImpl(String id, String name) {
        super(id, name);
    }

}
