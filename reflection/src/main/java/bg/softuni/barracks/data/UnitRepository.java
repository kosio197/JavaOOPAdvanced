package bg.softuni.barracks.data;

import java.util.Map;
import java.util.TreeMap;

import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.Unit;

public class UnitRepository implements Repository {

    private Map<String, Integer> amountOfUnits;

    public UnitRepository() {
        this.amountOfUnits = new TreeMap<>();
    }

    @Override
    public void addUnit(Unit unit) {
        String unitType = unit.getClass().getSimpleName();
        if (!this.amountOfUnits.containsKey(unitType)) {
            this.amountOfUnits.put(unitType, 0);
        }

        int newAmount = this.amountOfUnits.get(unitType) + 1;
        this.amountOfUnits.put(unitType, newAmount);
    }

    @Override
    public String getStatistics() {
        StringBuilder statBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : amountOfUnits.entrySet()) {
            String formatedEntry = String.format("%s -> %d%n", entry.getKey(), entry.getValue());
            statBuilder.append(formatedEntry);
        }
        statBuilder.setLength(statBuilder.length() - System.lineSeparator().length());

        return statBuilder.toString();
    }

    @Override
    public void removeUnit(String unitType) {

        if (!amountOfUnits.containsKey(unitType) || amountOfUnits.get(unitType) <= 0) {
            throw new IllegalArgumentException("No such units in repository.");
        }
        this.amountOfUnits.put(unitType, this.amountOfUnits.get(unitType) - 1);
    }
}
