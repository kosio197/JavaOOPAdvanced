package bg.softuni.pet_clinics.contract;

import bg.softuni.pet_clinics.model.Pet;

public interface PetRepository {

    void addPet(Pet pet);

    Pet getPet(String name);
}
