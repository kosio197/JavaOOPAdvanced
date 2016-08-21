package bg.softuni.strategy_pattern.model;

import bg.softuni.strategy_pattern.contract.StrategyPattern;

public abstract class StrategyPatternPerson implements StrategyPattern {

    private String name;
    private int age;

    public StrategyPatternPerson(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(StrategyPattern o) {
        return this.compare(this, o);
    }

    @Override
    public int compare(StrategyPattern o1, StrategyPattern o2) {
        return 0;
    }
}
