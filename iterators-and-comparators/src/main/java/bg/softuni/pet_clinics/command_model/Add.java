package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.Clinic;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.PetRepository;
import bg.softuni.pet_clinics.model.Pet;

public class Add extends Command {

    private String petName;
    private String clinicName;

    public Add(ClinicRepository repository, PetRepository petRepository, String command) {
        super(repository, petRepository, command);
        setProparty(command);
    }

    private void setProparty(String command) {
        this.petName = command.split("\\s+")[1];
        this.clinicName = command.split("\\s+")[2];
    }

    @Override
    protected String doExecute() {
        Clinic clinic = super.getRepository().getClinic(clinicName);
        Pet pet = super.getPetRepository().getPet(petName);

        if (clinic != null && pet != null) {
            return String.valueOf(clinic.addPet(pet));
        }
        return "false";
    }

}
