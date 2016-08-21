package bg.softuni.InfernoInfinity.factory;

import bg.softuni.InfernoInfinity.contract.Weapon;
import bg.softuni.InfernoInfinity.contract.Weapon.WeaponType;
import bg.softuni.InfernoInfinity.model.MyWeapon;

public class WeaponFactory {

    public static Weapon createWeapon(String type, String name) {

        try {
            return new MyWeapon(WeaponType.valueOf(type), name);
        } catch (IllegalArgumentException e) {
            // noting to do
        }

        return null;
    }
}
