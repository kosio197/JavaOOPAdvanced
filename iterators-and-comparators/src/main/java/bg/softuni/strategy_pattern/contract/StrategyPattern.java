package bg.softuni.strategy_pattern.contract;

import java.util.Comparator;

public interface StrategyPattern extends Comparable<StrategyPattern>, Comparator<StrategyPattern> {

    String getName();

    int getAge();
}
