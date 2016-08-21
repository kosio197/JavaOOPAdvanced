package bg.softuni.pet_clinics.io;

import bg.softuni.pet_clinics.command_model.Add;
import bg.softuni.pet_clinics.command_model.CreateClinic;
import bg.softuni.pet_clinics.command_model.CreatePet;
import bg.softuni.pet_clinics.command_model.HasEmptyRooms;
import bg.softuni.pet_clinics.command_model.Print;
import bg.softuni.pet_clinics.command_model.Release;
import bg.softuni.pet_clinics.contract.ClinicRepository;
import bg.softuni.pet_clinics.contract.Executable;
import bg.softuni.pet_clinics.contract.PetRepository;
import bg.softuni.pet_clinics.repository.ClinicWaitingPet;
import bg.softuni.pet_clinics.repository.PetClinicRepository;

public class CommandInterpreter {

    private ClinicRepository repository;
    private PetRepository petRepository;

    public CommandInterpreter() {
        this.repository = new PetClinicRepository();
        this.petRepository = new ClinicWaitingPet();
    }

    public String executeCommand(String command) {

        Executable currentCommand = getCommand(command);

        if (currentCommand != null) {
            return currentCommand.execute();
        }
        return null;
    }

    private Executable getCommand(String command) {

        if (command.startsWith("Create Pet")) {
            return new CreatePet(repository, petRepository, command);

        } else if (command.startsWith("Create Clinic")) {
            return new CreateClinic(repository, petRepository, command);

        } else if (command.startsWith("Add")) {
            return new Add(repository, petRepository, command);

        } else if (command.startsWith("Release")) {
            return new Release(repository, petRepository, command);

        } else if (command.startsWith("HasEmptyRooms")) {
            return new HasEmptyRooms(repository, petRepository, command);

        } else if (command.startsWith("Print")) {
            return new Print(repository, petRepository, command);
        }
        return null;
    }
}
