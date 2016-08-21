package bg.softuni.multipleimplementation.io;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

import bg.softuni.multipleImplementation.model.Birthable;
import bg.softuni.multipleImplementation.model.Citizen;
import bg.softuni.multipleImplementation.model.Identifiable;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Class[] citizenInterfaces = Citizen.class.getInterfaces();

        if (Arrays.asList(citizenInterfaces).contains(Birthable.class) &&
                Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {

            Method[] methods = Birthable.class.getDeclaredMethods();
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());

            methods = Identifiable.class.getDeclaredMethods();

            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());

            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name, age, id, birthdate);
            Birthable birthable = new Citizen(name, age, id, birthdate);

            identifiable.toString();
            birthable.toString();
        }
    }
}
