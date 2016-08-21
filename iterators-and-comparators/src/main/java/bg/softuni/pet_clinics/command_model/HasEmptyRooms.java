package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.Clinic;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.PetRepository;

public class HasEmptyRooms extends Command {

    private String clinicName;

    public HasEmptyRooms(ClinicRepository repository, PetRepository petPepository, String command) {
        super(repository, petPepository, command);
        setProparty(command);
    }

    private void setProparty(String command) {
        this.clinicName = command.split("\\s+")[1];
    }

    @Override
    protected String doExecute() {
        Clinic clinic = super.getRepository().getClinic(clinicName);

        if (clinic != null) {
            return String.valueOf(clinic.hasEmptyRooms());
        }
        return "false";
    }

}
