package bg.softuni.mood3.model.contracts;

public interface Player {
    String getUsername();

    String getType();

    void setHashedPassword();

    String getHashedPassword();

    double getSpecialPoints();

    int getLevel();

    void setEnergy();

}
