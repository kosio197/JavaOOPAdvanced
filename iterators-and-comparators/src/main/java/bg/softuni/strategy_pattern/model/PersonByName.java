package bg.softuni.strategy_pattern.model;

import bg.softuni.strategy_pattern.contract.StrategyPattern;

public class PersonByName extends StrategyPatternPerson {

    public PersonByName(String name, int age) {
        super(name, age);
    }

    @Override
    public int compare(StrategyPattern o1, StrategyPattern o2) {
        if (o1.getName().length() > o2.getName().length()) {
            return 1;
        } else if (o1.getName().length() < o2.getName().length()) {
            return -1;
        } else {
            return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
        }
    }

}
