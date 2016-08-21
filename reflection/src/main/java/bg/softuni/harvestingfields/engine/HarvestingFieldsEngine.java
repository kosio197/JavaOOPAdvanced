package bg.softuni.harvestingfields.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import bg.softuni.harvestingfields.data.RichSoilLand;

public class HarvestingFieldsEngine {

    RichSoilLand testClass = new RichSoilLand();
    public String processCommand(String command) {

        switch (command) {
            case "private":
                return getPrivateFields();
            case "public":
                return getPublicFields();
            case "protected":
                return getProtectedFields();
            case "all":
                return getAllFields();

            default:
                break;
        }

        return null;
    }

    private String getAllFields() {
        StringBuilder sb = new StringBuilder();

        Field[] fields = testClass.getClass().getDeclaredFields();

        for (Field field : fields) {
            sb.append(String.format("%s %s %s\n", Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(),
                    field.getName()));
        }

        return sb.toString();
    }

    private String getProtectedFields() {
        StringBuilder sb = new StringBuilder();

        Field[] fields = testClass.getClass().getDeclaredFields();

        for (Field field : fields) {
            String modifier = Modifier.toString(field.getModifiers());
            if (modifier.equals("protected")) {
                sb.append(String.format("%s %s %s\n", modifier, field.getType().getSimpleName(), field.getName()));
            }
        }

        return sb.toString();
    }

    private String getPublicFields() {
        StringBuilder sb = new StringBuilder();

        Field[] fields = testClass.getClass().getFields();

        for (Field field : fields) {
            sb.append(String.format("%s %s %s\n", Modifier.toString(field.getModifiers()),
                    field.getType().getSimpleName(), field.getName()));
        }

        return sb.toString();
    }

    private String getPrivateFields() {
        StringBuilder sb = new StringBuilder();

        Field[] fields = testClass.getClass().getDeclaredFields();

        for (Field field : fields) {
            String modifier = Modifier.toString(field.getModifiers());
            if (modifier.equals("private")) {
                sb.append(String.format("%s %s %s\n", modifier,
                        field.getType().getSimpleName(), field.getName()));
            }
        }

        return sb.toString();
    }
}
