package bg.softuni.pet_clinics.repository;

import java.util.HashMap;
import java.util.Map;

import bg.softuni.pet_clinics.contract.Clinic;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.model.Pet;

public class PetClinicRepository implements ClinicRepository {

    private Map<String, Clinic> clinics;

    public PetClinicRepository() {
        setClinics();
    }

    @Override
    public void addClinic(Clinic clinic) {
        this.clinics.put(clinic.getName(), clinic);
    }

    @Override
    public Clinic getClinic(String name) {
        return clinics.get(name);
    }

    @Override
    public String printRoom(String clinicName, int roomIndex) {
        Pet pet = clinics.get(clinicName).getRooms()[roomIndex - 1];
        if (pet != null) {
            return pet.toString();
        }
        return "Room empty";
    }

    @Override
    public String printAllRooms(String clinicName) {
        StringBuilder sb = new StringBuilder();
        for (Pet pet : clinics.get(clinicName).getRooms()) {
            if (pet != null) {
                sb.append(pet.toString());
                sb.append("\n");
            } else {
                sb.append("Room empty\n");
            }

        }

        return sb.toString().trim();
    }

    public Map<String, Clinic> getClinics() {
        return clinics;
    }

    private void setClinics() {
        this.clinics = new HashMap<>();
    }

}
