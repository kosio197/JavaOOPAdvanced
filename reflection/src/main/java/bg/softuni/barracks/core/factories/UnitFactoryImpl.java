package bg.softuni.barracks.core.factories;

import java.lang.reflect.Constructor;

import bg.softuni.barracks.contract.Unit;
import bg.softuni.barracks.contract.UnitFactory;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "bg.softuni.barracks.model.unit.";

    @Override
    public Unit createUnit(String unitType) {
        Unit unit = null;

        try {
            Class<?> unitClas = Class.forName(UNITS_PACKAGE_NAME + unitType);

            Constructor<?> ctor = unitClas.getDeclaredConstructor();
            ctor.setAccessible(true);

            unit = (Unit) ctor.newInstance();
        } catch (ReflectiveOperationException e) {
            System.out.println("UnitFactoryImpl class can not produce Unit " + unitType);
        }
        return unit;
    }
}
