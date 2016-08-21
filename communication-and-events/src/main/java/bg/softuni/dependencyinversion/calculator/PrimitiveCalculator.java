package bg.softuni.dependencyinversion.calculator;

import bg.softuni.dependencyinversion.contract.Strategy;
import bg.softuni.dependencyinversion.event.StrategyChangedEvent;
import bg.softuni.dependencyinversion.model.AdditionStrategy;

public class PrimitiveCalculator {

    private Strategy strategy;

    public PrimitiveCalculator(){
        this(new AdditionStrategy());
    }

    public PrimitiveCalculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doCalculate(double d1, double d2) {
        return this.strategy.calculate(d1, d2);
    }

    public void changeStraategy(Strategy stategy) {
        setStrategy(stategy);
        new StrategyChangedEvent(this, this.strategy, strategy);
    }

    private void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
