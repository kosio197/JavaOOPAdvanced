package bg.softuni.blackboxinteger.engine;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import bg.softuni.blackboxinteger.model.BlackBoxInt;

public class BlackBoxEngine {

    private BlackBoxInt testClass;

    public BlackBoxEngine() throws NoSuchMethodException, SecurityException, InstantiationException,
    IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setConstructorValue();

    }

    private void setConstructorValue() throws NoSuchMethodException, SecurityException,
    InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<BlackBoxInt> bb = BlackBoxInt.class;
        Constructor<BlackBoxInt> ctor = bb.getDeclaredConstructor();
        ctor.setAccessible(true);
        testClass = ctor.newInstance();

    }

    public int executeCommand(String command) throws NoSuchFieldException, SecurityException, NoSuchMethodException,
    IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String commandInfo[] = command.split("_");

        String calculatemethods = commandInfo[0].trim();
        int value = Integer.parseInt(commandInfo[1].trim());

        Field field = this.testClass.getClass().getDeclaredField("innerValue");
        field.setAccessible(true);

        Method method = testClass.getClass().getDeclaredMethod(calculatemethods, int.class);
        method.setAccessible(true);
        method.invoke(testClass, value);
        return field.getInt(testClass);
    }
}
