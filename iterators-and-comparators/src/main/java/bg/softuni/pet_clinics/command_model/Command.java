package bg.softuni.pet_clinics.command_model;

import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.Executable;
import bg.softuni.pet_clinics.contract.PetRepository;

public  abstract class Command implements Executable{

    private ClinicRepository repository;
    private PetRepository petRepository;

    public Command(ClinicRepository repository, PetRepository petRepository, String command) {
        setRepository(repository);
        setPetRepository(petRepository);
    }

    protected abstract String doExecute();

    protected ClinicRepository getRepository() {
        return repository;
    }

    private void setRepository(ClinicRepository repository) {
        this.repository = repository;
    }

    @Override
    public String execute() {
        return doExecute();
    }

    public PetRepository getPetRepository() {
        return petRepository;
    }

    public void setPetRepository(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

}
