package bg.softuni.birthdaycelebration.city;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import bg.softuni.birthdaycelebration.model.citizen.contracts.Birthable;
import bg.softuni.birthdaycelebration.model.citizen.contracts.Citizen;
import bg.softuni.birthdaycelebration.model.city.contracts.City;

public class CityImpl implements City {

    private List<Citizen> citizens;

    public CityImpl() {
        this.citizens = new ArrayList<>();
    }

    @Override
    public void addCitizen(Citizen citizen) {
        this.citizens.add(citizen);
    }

    @Override
    public List<Citizen> getAllCitizens() {
        return Collections.unmodifiableList(citizens);
    }

    @Override
    public List<Citizen> getAllDetainedCitizens(String num) {
        List<Citizen> result = new ArrayList<>();

        Iterator<Citizen> iterator = citizens.iterator();

        while (iterator.hasNext()) {
            Citizen next = iterator.next();

            if (next.getId().endsWith(num)) {
                result.add(next);
            }
        }
        return Collections.unmodifiableList(result);
    }

    @Override
    public List<Birthable> getAllCitizensWithBirthyear(String year) {
        List<Birthable> result = new ArrayList<Birthable>();

        for (Citizen citizen : citizens) {
            if (citizen instanceof Birthable && ((Birthable)citizen).getBirthday().endsWith(year)) {
                result.add((Birthable)citizen);
            }
        }

        return result;
    }
}
