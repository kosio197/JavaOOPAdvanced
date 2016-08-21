package bg.softuni.InfernoInfinity.gameengine;

import bg.softuni.InfernoInfinity.contract.Weapon;
import bg.softuni.InfernoInfinity.custom_class_annotation.CustomClassAnnotation;
import bg.softuni.InfernoInfinity.factory.GemFactori;
import bg.softuni.InfernoInfinity.factory.WeaponFactory;
import bg.softuni.InfernoInfinity.model.MyGem.Gem;
import bg.softuni.InfernoInfinity.model.MyWeapon;
import bg.softuni.InfernoInfinity.repository.WeaponRepository;

public class ProcesGame {

    private static WeaponRepository repository = new WeaponRepository();

    public static String processCommand(String command) {
        if (command.equals("")) {
            return null;
        }

        if (command.indexOf(";") < 0) {
            CustomClassAnnotation anotation = MyWeapon.class.getAnnotation(CustomClassAnnotation.class);

            switch (command) {
                case "Author":
                    return "Author: " + anotation.author();
                case "Revision":
                    return "Revision: " + anotation.Revision();
                case "Description":
                    return "Class description: " + anotation.Description();
                case "Reviewers":
                    return "Reviewers: " + anotation.Reviewers();
                default:
                    return null;
            }
        }

        String info[] = command.split(";");

        Weapon weapon = null;
        Gem gem = null;

        switch (info[0]) {
            case "Create":
                weapon = WeaponFactory.createWeapon(info[1].toUpperCase(), info[2]);
                if (weapon != null) {
                    repository.addWeapon(weapon);
                }
                break;

            case "Add":
                weapon = repository.getWeapon(info[1]);
                if (weapon != null) {
                    gem = GemFactori.createGem(info[3].toUpperCase());
                    if (gem != null) {
                        weapon.addGem(Integer.parseInt(info[2].trim()), gem);
                    }
                }
                break;

            case "Remove":
                weapon = repository.getWeapon(info[1]);
                if (weapon != null) {
                    weapon.removeGem(Integer.parseInt(info[2].trim()));
                }
                break;

            case "Print":
                weapon = repository.getWeapon(info[1]);
                if (weapon != null) {
                    return weapon.toString();
                }
                break;

            case "Compare":
                weapon = repository.getWeapon(info[1]);
                Weapon weapon1 = repository.getWeapon(info[2]);

                if (weapon != null && weapon1 != null) {
                    return getBiggerWeapon(weapon, weapon1);
                }
                break;
            default:
                break;
        }

        return null;
    }

    private static String getBiggerWeapon(Weapon weapon, Weapon weapon1) {
        if(weapon.compareTo(weapon1) >=0){
            return String.format("%s (Item Level: %.1f)", weapon.toString(), weapon.getItemLevel());
        } else {
            return String.format("%s (Item Level: %.1f)", weapon1.toString(), weapon1.getItemLevel());

        }
    }

    public static String printAllWeapon() {
        StringBuilder sb = new StringBuilder();

        for (Weapon weapon : repository) {
            sb.append(weapon.toString());
            sb.append("\n");
        }

        return sb.toString().trim();
    }
}
