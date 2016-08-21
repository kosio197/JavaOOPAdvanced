package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.PetRepository;
import bg.softuni.pet_clinics.model.Pet;

public class CreatePet extends Command {

    private Pet pet;

    public CreatePet(ClinicRepository repository, PetRepository petRepository, String command) {
        super(repository, petRepository, command);
        setPet(command);
    }

    private void setPet(String command) {
        String petInfo[] = command.split("\\s+");
        this.pet = new Pet(petInfo[2], Integer.parseInt(petInfo[3]), petInfo[4]);
    }

    @Override
    protected String doExecute() {
        super.getPetRepository().addPet(pet);
        return null;
    }
}
