package bg.softuni.dependencyinversion.model;

import bg.softuni.dependencyinversion.contract.Strategy;

public class MultiplyStrategy implements Strategy {

    @Override
    public int calculate(double d1, double d2) {
        return (int) (d1 * d2);
    }

}
