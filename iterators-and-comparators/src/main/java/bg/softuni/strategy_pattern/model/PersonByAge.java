package bg.softuni.strategy_pattern.model;

import bg.softuni.strategy_pattern.contract.StrategyPattern;

public class PersonByAge extends StrategyPatternPerson {

    public PersonByAge(String name, int age) {
        super(name, age);
    }

    @Override
    public int compare(StrategyPattern o1, StrategyPattern o2) {
        return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
    }

}
