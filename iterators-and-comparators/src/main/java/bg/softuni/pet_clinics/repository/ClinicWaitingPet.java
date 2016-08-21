package bg.softuni.pet_clinics.repository;

import java.util.HashMap;
import java.util.Map;

import bg.softuni.pet_clinics.contract.PetRepository;
import bg.softuni.pet_clinics.model.Pet;

public class ClinicWaitingPet implements PetRepository {

    private Map<String, Pet> pets;

    public ClinicWaitingPet() {
        setPets();
    }

    @Override
    public void addPet(Pet pet) {
        pets.put(pet.getName(), pet);
    }

    @Override
    public Pet getPet(String name) {
        Pet pet = pets.get(name);
        return pet;
    }

    private void setPets() {
        this.pets = new HashMap<>();
    }

}
