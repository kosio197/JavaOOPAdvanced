package bg.softuni.pet_clinics.model;

import bg.softuni.pet_clinics.contract.Clinic;

public class PetClinic implements Clinic {

    private String name;
    private Pet[] rooms;
    private int middle;

    public PetClinic(String name, int size) {
        setName(name);
        setRooms(size);
        setMiddle();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Pet[] getRooms() {
        return rooms;
    }

    @Override
    public boolean addPet(Pet pet) {
        for (int i = 0; i <= middle; i++) {
            if (rooms[middle - i] == null) {
                rooms[middle - i] = pet;
                return true;

            } else if (rooms[middle + i] == null) {
                rooms[middle + i] = pet;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean remove() {
        for (int i = 0; i <= middle; i++) {
            if (rooms[middle + i] != null) {
                rooms[middle + i] = null;
                return true;
            }
        }
        for (int i = 0; i <= middle; i++) {
            if (rooms[i] != null) {
                rooms[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasEmptyRooms() {
        for (Pet pet : rooms) {
            if (pet == null) {
                return true;
            }
        }
        return false;
    }

    private void setRooms(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms = new Pet[size];
    }

    private void setMiddle() {
        this.middle = rooms.length / 2;
    }

    private void setName(String name) {
        this.name = name;
    }
}
