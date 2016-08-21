package bg.softuni.kings_gambit.contract;

public interface GambitRepository<GambitPerson> extends Iterable<GambitPerson>, GambitPersonDeathEventListener {

    void addElement(GambitPerson t);

    void removeElement(GambitPerson t);

}
