package bg.softuni.dependencyinversion.event;

import java.util.EventObject;

import bg.softuni.dependencyinversion.contract.Strategy;

public class StrategyChangedEvent extends EventObject {
    private static final long serialVersionUID = 1L;

    private Strategy oldStrategy;
    private Strategy currentStrategy;

    public StrategyChangedEvent(Object source, Strategy oldStrategy, Strategy currentStrategy) {
        super(source);
        setOldStrategy(oldStrategy);
        setCurrentStrategy(currentStrategy);
    }

    public Strategy getCurrentStrategy() {
        return currentStrategy;
    }

    private void setCurrentStrategy(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public Strategy getOldStrategy() {
        return oldStrategy;
    }

    private void setOldStrategy(Strategy oldStrategy) {
        this.oldStrategy = oldStrategy;
    }

}
