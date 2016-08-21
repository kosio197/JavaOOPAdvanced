package bg.softuni.birthdaycelebration.model.city.contracts;

import java.util.List;

import bg.softuni.birthdaycelebration.model.citizen.contracts.Birthable;
import bg.softuni.birthdaycelebration.model.citizen.contracts.Citizen;

public interface City {
    public void addCitizen(Citizen citizen);
    public List<Citizen> getAllCitizens();
    public List<Citizen> getAllDetainedCitizens(String num);
    public List<Birthable> getAllCitizensWithBirthyear(String year);
}
