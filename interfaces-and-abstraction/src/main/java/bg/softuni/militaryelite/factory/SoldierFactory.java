package bg.softuni.militaryelite.factory;

import bg.softuni.militaryelite.model.soldier.CommandoImpl;
import bg.softuni.militaryelite.model.soldier.EngineerImpl;
import bg.softuni.militaryelite.model.soldier.LeutenantGeneralImpl;
import bg.softuni.militaryelite.model.soldier.PrivateImpl;
import bg.softuni.militaryelite.model.soldier.SpyImpl;
import bg.softuni.militaryelite.model.soldier.contracts.Soldier;
import bg.softuni.militaryelite.model.soldier.contracts.SpecialisedSoldier.Corps;

public class SoldierFactory {
    public static Soldier createPrivate(String id, String firstName, String lastName, double salary) {
        return new PrivateImpl(id, firstName, lastName, salary);
    }

    public static Soldier createLeutenantGeneral(String id, String firstName, String lastName, double salary) {
        return new LeutenantGeneralImpl(id, firstName, lastName, salary);
    }

    public static Soldier createEngineer(String id, String firstName, String lastName, double salary, Corps corps) {
        return new EngineerImpl(id, firstName, lastName, salary, corps);
    }

    public static Soldier createCommando(String id, String firstName, String lastName, double salary, Corps corps) {
        return new CommandoImpl(id, firstName, lastName, salary, corps);
    }
    public static Soldier createSpy(String id, String firstName, String lastName, long codeNumber) {
        return new SpyImpl(id, firstName, lastName, codeNumber);
    }
}
