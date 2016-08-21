package bg.softuni.pet_clinics.contract;

import bg.softuni.pet_clinics.model.Pet;

public interface Clinic {

    String getName();

    Pet[] getRooms();

    boolean addPet(Pet pet);

    boolean remove();

    boolean hasEmptyRooms();
}
