package bg.softuni.barracks.io;


import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.UnitFactory;
import bg.softuni.barracks.core.Engine;
import bg.softuni.barracks.core.factories.UnitFactoryImpl;
import bg.softuni.barracks.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
