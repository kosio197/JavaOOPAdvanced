package bg.softuni.kings_gambit.model;

import bg.softuni.kings_gambit.contract.GambitPersonAttackListener;

public abstract class GambitPerson implements GambitPersonAttackListener {

    private String name;
    private int damagePoint;

    public GambitPerson(String name, int damagePoint) {
        setName(name);
        setDamagePoint(damagePoint);
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    protected int getDamagePoint() {
        return damagePoint;
    }

    protected void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

}
