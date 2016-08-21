package bg.softuni.InfernoInfinity.factory;

import bg.softuni.InfernoInfinity.model.MyGem.Gem;

public class GemFactori {

    public static Gem createGem(String info) {
        Gem gem = null;

        try {
            gem = Gem.valueOf(info);
        } catch (Exception e) {
            // noting to do
        }

        return gem;
    }
}
