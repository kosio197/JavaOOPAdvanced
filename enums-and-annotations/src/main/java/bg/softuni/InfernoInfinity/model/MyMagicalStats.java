package bg.softuni.InfernoInfinity.model;

import bg.softuni.InfernoInfinity.contract.MagicalStats;

public class MyMagicalStats implements MagicalStats {

    private int strength;
    private int agility;
    private int vitality;

    public MyMagicalStats(int strength, int agility, int vitality) {
        super();
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getAgility() {
        return agility;
    }

    @Override
    public int getVitality() {
        return vitality;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

}
