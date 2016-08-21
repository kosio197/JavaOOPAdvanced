package bg.softuni.militaryelite.model;

import bg.softuni.militaryelite.model.contracts.Mission;

public class MissionImpl implements Mission {

    private String codeName;
    private State state;

    public MissionImpl(String codeName, State state) {

        this.codeName = codeName;
        setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.state = State.Finished;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", getCodeName(), getState());
    }
}
