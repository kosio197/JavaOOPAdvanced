package bg.softuni.birthdaycelebration.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.birthdaycelebration.city.CitizenFactory;
import bg.softuni.birthdaycelebration.city.CityImpl;
import bg.softuni.birthdaycelebration.model.citizen.contracts.Birthable;
import bg.softuni.birthdaycelebration.model.citizen.contracts.Citizen;
import bg.softuni.birthdaycelebration.model.city.contracts.City;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String info = br.readLine();
        City city = new CityImpl();

        while (!info.equals("End")) {
            String data[] = info.split("\\s");
            Citizen citizen;
            String type = data[0];

            if (type.equalsIgnoreCase("Robot")) {
                citizen = CitizenFactory.createRobot(data[2], data[1]);
            } else if (type.equalsIgnoreCase("Citizen")) {
                citizen = CitizenFactory.createPerson(data[3], data[1], Integer.valueOf(data[2]), data[4]);
            } else if (type.equalsIgnoreCase("Pet")) {
                citizen = CitizenFactory.createPet(data[1], data[2]);
            } else {
                throw new IllegalArgumentException("Invalid input: " + type);
            }

            city.addCitizen(citizen);

            info = br.readLine();
        }

        String year = br.readLine();
        br.close();

        for (Birthable citizen : city.getAllCitizensWithBirthyear(year)) {
            System.out.println(citizen.getBirthday());
        }
    }
}