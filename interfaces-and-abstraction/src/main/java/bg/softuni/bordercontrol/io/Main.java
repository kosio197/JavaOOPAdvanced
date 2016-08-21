package bg.softuni.bordercontrol.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.bordercontrol.city.CitizenFactory;
import bg.softuni.bordercontrol.city.CityImpl;
import bg.softuni.bordercontrol.model.citizen.contracts.Citizen;
import bg.softuni.bordercontrol.model.city.contracts.City;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String info = br.readLine();
        City city = new CityImpl();

        while (!info.equals("End")) {
            String data[] = info.split("\\s");
            Citizen citizen;

            if (data.length == 2) {
                citizen = CitizenFactory.createRobot(data[1], data[0]);
            } else {
                citizen = CitizenFactory.createPerson(data[2], data[0], Integer.valueOf(data[1]));
            }

            city.addCitizen(citizen);

            info = br.readLine();
        }

        String numberForCheck = br.readLine();
        br.close();

        for (Citizen citizen : city.getAllDetainedCitizens(numberForCheck)) {
            System.out.println(citizen.getId());
        }
    }
}