package bg.softuni.InfernoInfinity.contract;

import bg.softuni.InfernoInfinity.model.MyGem.Gem;
import bg.softuni.InfernoInfinity.model.MyMagicalStats;

public interface Weapon extends Comparable<Weapon> {
    /*
     * Axe (5-10 damage, 4 sockets) Sword (4-6 damage, 3 sockets) Knife (3-4
     * damage, 2 sockets)
     */
    public enum WeaponType {

        AXE(5, 10, 4), SWORD(4, 6, 3), KNIFE(3, 4, 2);

        private int minDamage;
        private int maxDamage;
        private int socketsCount;

        private WeaponType(int minDamage, int maxDamage, int socketsCount) {
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
            this.socketsCount = socketsCount;
        }

        public int getMinDamage() {
            return minDamage;
        }

        public int getMaxDamage() {
            return maxDamage;
        }

        public int getSocketsCount() {
            return socketsCount;
        }
    }

    int getMinDamage();

    int getMaxDamage();

    int getSocketsCount();

    MyMagicalStats getMagicStats();

    String getName();

    void addGem(int index, Gem gem);

    void removeGem(int index);

    double getItemLevel();

    void setItemLevel();
}
