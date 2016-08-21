package bg.softuni.InfernoInfinity.model;

import bg.softuni.InfernoInfinity.contract.Weapon;
import bg.softuni.InfernoInfinity.custom_class_annotation.CustomClassAnnotation;
import bg.softuni.InfernoInfinity.model.MyGem.Gem;

@CustomClassAnnotation(Description = "Used for Java OOP Advanced course - Enumerations and Annotations.", Reviewers = "Pesho, Svetlio", Revision = "3", author = "Pesho")
public class MyWeapon implements Weapon {

    private String name;
    private int minDamage;
    private int maxDamage;
    private int socketsCount;
    private double itemLevel;
    private MyMagicalStats magicStats;
    private Gem[] gems;

    public MyWeapon(WeaponType type, String name) {
        super();
        this.name = name;
        this.minDamage = type.getMinDamage();
        this.maxDamage = type.getMaxDamage();
        this.socketsCount = type.getSocketsCount();
        this.gems = new Gem[socketsCount];
        this.magicStats = new MyMagicalStats(0, 0, 0);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getMinDamage() {
        return minDamage;
    }
    @Override
    public int getMaxDamage() {
        return maxDamage;
    }
    @Override
    public int getSocketsCount() {
        return socketsCount;
    }
    @Override
    public MyMagicalStats getMagicStats() {
        return magicStats;
    }

    protected void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }
    protected void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    protected void setMagicStats(MyMagicalStats newMagicStats) {
        this.magicStats.setStrength(magicStats.getStrength() + newMagicStats.getStrength());
        this.magicStats.setAgility(magicStats.getAgility() + newMagicStats.getAgility());
        this.magicStats.setVitality(magicStats.getVitality() + newMagicStats.getVitality());
    }

    @Override
    public void addGem(int index, Gem gem) {
        if (index < 0 || index > gems.length - 1) {
            return;
        } else if (gems[index] != null) {
            removeGem(index);
        }

        gems[index] = gem;
        setMagicStats(new MyMagicalStats(gem.getStrength(), gem.getAgility(), gem.getVitality()));
        this.minDamage += gem.getBonusMinDamage();
        this.maxDamage += gem.getBonusMaxdamage();
    }


    @Override
    public void removeGem(int index) {
        if (index < 0 || index > gems.length - 1 || gems[index] == null) {
            return;
        }
        Gem removed = gems[index];
        setMagicStats(new MyMagicalStats(-removed.getStrength(), -removed.getAgility(), -removed.getVitality()));
        this.minDamage -= removed.getBonusMinDamage();
        this.maxDamage -= removed.getBonusMaxdamage();
        gems[index] = null;
    }

    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality", name, minDamage, maxDamage,
                magicStats.getStrength(), magicStats.getAgility(), magicStats.getVitality());
    }

    @Override
    public double getItemLevel() {
        return itemLevel;
    }

    @Override
    public void setItemLevel() {
        this.itemLevel = ((double) (minDamage + maxDamage) / 2 + magicStats.getStrength() + magicStats.getAgility()
        + magicStats.getVitality());
    }

    @Override
    public int compareTo(Weapon anotherWeapon) {
        this.setItemLevel();
        anotherWeapon.setItemLevel();

        return this.getItemLevel() > anotherWeapon.getItemLevel() ? 1
                : this.getItemLevel() == anotherWeapon.getItemLevel() ? 0 : -1;
    }
}
