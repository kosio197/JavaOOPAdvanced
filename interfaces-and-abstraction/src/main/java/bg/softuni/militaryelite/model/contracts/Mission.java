package bg.softuni.militaryelite.model.contracts;

public interface Mission {
    public enum State {
        Finished, inProgress
    }

    String getCodeName();
    State getState();
    void setState(State state);
    void completeMission();
}
