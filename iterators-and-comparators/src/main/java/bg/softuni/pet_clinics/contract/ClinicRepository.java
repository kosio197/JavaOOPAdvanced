package bg.softuni.pet_clinics.contract;

public interface ClinicRepository {

    void addClinic(Clinic clinic);

    Clinic getClinic(String name);

    String printRoom(String clinicName, int roomIndex);

    String printAllRooms(String clinicName);
}
