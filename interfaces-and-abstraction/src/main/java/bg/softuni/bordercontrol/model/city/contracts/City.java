package bg.softuni.bordercontrol.model.city.contracts;

import java.util.List;

import bg.softuni.bordercontrol.model.citizen.contracts.Citizen;

public interface City {
    public void addCitizen(Citizen citizen);
    public List<Citizen> getAllCitizens();
    public List<Citizen> getAllDetainedCitizens(String num);
}
