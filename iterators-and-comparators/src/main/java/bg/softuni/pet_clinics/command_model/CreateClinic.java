package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.Clinic;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.PetRepository;
import bg.softuni.pet_clinics.model.PetClinic;

public class CreateClinic extends Command {

    private Clinic clinic;

    public CreateClinic(ClinicRepository repository, PetRepository petPepository, String command) {
        super(repository, petPepository, command);
        setClinic(command);
    }

    private void setClinic(String command) {
        String clinicInfo[] = command.split("\\s+");
        this.clinic = new PetClinic(clinicInfo[2], Integer.parseInt(clinicInfo[3]));
    }

    @Override
    protected String doExecute() {
        super.getRepository().addClinic(clinic);
        return null;
    }

}
