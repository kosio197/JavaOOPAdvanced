package bg.softuni.militaryelite.model.soldier.contracts;


public interface SpecialisedSoldier {
    public enum Corps {
        Airforces, Marines;
    }

    Corps getCorps();
}
