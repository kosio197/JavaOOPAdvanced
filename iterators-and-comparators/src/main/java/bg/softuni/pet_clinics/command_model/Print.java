package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.Clinic;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.PetRepository;

public class Print extends Command {

    private String clinicName;
    private Integer roomIndex;

    public Print(ClinicRepository repository, PetRepository petPepository, String command) {
        super(repository, petPepository, command);
        setProparty(command);
    }

    private void setProparty(String command) {

        String info[] = command.split("\\s+");
        this.clinicName = info[1];

        if (info.length > 2) {
            this.roomIndex = Integer.parseInt(info[2]);
        }
    }

    @Override
    protected String doExecute() {
        Clinic clinic = super.getRepository().getClinic(clinicName);

        if (clinic != null) {
            if (roomIndex != null) {
                return super.getRepository().printRoom(clinic.getName(), roomIndex);
            } else {
                return super.getRepository().printAllRooms(clinic.getName());
            }
        }
        return null;
    }

}
