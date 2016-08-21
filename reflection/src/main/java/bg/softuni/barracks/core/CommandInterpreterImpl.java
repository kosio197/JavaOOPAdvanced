package bg.softuni.barracks.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import bg.softuni.barracks.contract.CommandInterpreter;
import bg.softuni.barracks.contract.Executable;
import bg.softuni.barracks.contract.Inject;
import bg.softuni.barracks.contract.Repository;
import bg.softuni.barracks.contract.UnitFactory;

public class CommandInterpreterImpl implements CommandInterpreter {

    private static final String COMMAND_PACKAGE_NAME = "bg.softuni.barracks.core.command.";

    private Repository repository;
    private UnitFactory unitFactory;

    public CommandInterpreterImpl(Repository repository, UnitFactory unitFactory) {
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public Executable interpretCommand(String[] data, String commandName) {

        char firstChar = commandName.toUpperCase().charAt(0);
        String className = firstChar + commandName.substring(1) + "Command";
        Executable executaple = null;
        try {
            Class<?> executapleClass = Class.forName(COMMAND_PACKAGE_NAME + className);
            Constructor<?> ctor = executapleClass.getConstructor(String[].class);
            ctor.setAccessible(true);
            executaple = (Executable) ctor.newInstance((Object) data);

            this.InjectDependanceFields(executaple, executapleClass);

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }

        return executaple;
    }

    private void InjectDependanceFields(Executable executaple, Class<?> executapleClass)
            throws IllegalArgumentException, IllegalAccessException {
        Field[] classFields = executapleClass.getDeclaredFields();
        Field[] currentFields = CommandInterpreterImpl.class.getDeclaredFields();

        for (Field field : classFields) {
            if (!field.isAnnotationPresent(Inject.class)) {
                continue;
            }

            field.setAccessible(true);

            for (Field thisField : currentFields) {
                if (!field.getType().equals(thisField.getType())) {
                    continue;
                }

                thisField.setAccessible(true);
                field.set(executaple, thisField.get(this));
            }
        }

    }
}
