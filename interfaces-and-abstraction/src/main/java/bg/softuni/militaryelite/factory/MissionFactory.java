package bg.softuni.militaryelite.factory;

import bg.softuni.militaryelite.model.MissionImpl;
import bg.softuni.militaryelite.model.contracts.Mission;
import bg.softuni.militaryelite.model.contracts.Mission.State;

public class MissionFactory {
    public static Mission createMission(String codeName, State state) {
        return new MissionImpl(codeName, state);
    }
}
